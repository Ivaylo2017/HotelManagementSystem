package com.langmore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.langmore.DAO.InventoryDAO;
import com.langmore.DAO.SecurityDAO;
import com.langmore.DAO.UserDAO;
import com.langmore.model.Inventory;
import com.langmore.model.Security;
import com.langmore.model.User;

@Controller
public class HomeController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping(value="/availRooms", method=RequestMethod.GET)
	public ModelAndView showAvailRooms() {
		ModelAndView mav = new ModelAndView("availRooms");
		InventoryDAO inv = new InventoryDAO();
		List<Inventory> invList = inv.getAvailRooms();
		mav.addObject("inventory",invList);
		return mav;
	}
	
	@RequestMapping(value="/getDetail", method=RequestMethod.GET)
	public ModelAndView showRoomDetail(@RequestParam("id") String room) {
		ModelAndView mav = new ModelAndView("roomDetail");
		InventoryDAO inv = new InventoryDAO();
		
		mav.addObject("room", inv.getItemInfo(room));
		return mav;
	}
	
	@RequestMapping(value="/book", method=RequestMethod.POST)
	public ModelAndView showNextStep(HttpServletRequest request) {
		HttpSession se = request.getSession();
		if (se.getAttribute("user") == null) {
			ModelAndView mav =  new ModelAndView("logonForm");
			mav.addObject("message", "You need to be logged in to book");
			return mav;
		}else {
			ModelAndView mav =  new ModelAndView("confirmOrder");
			mav.addObject("itemID",((Inventory) request.getAttribute("room")).getItemId());
			se.setAttribute("viewedRoom", request.getAttribute("room"));
			return mav;
		}
	}
	
	@RequestMapping(value="/requestQuote", method=RequestMethod.GET)
	public ModelAndView showQuoteForm() {
		return new ModelAndView("requestQuote");
	}
	
	@RequestMapping(value="/accountHome", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam("username") String username,
			@RequestParam("pass") String password, HttpServletRequest request) {
		
		ModelAndView mav = null;
		SecurityDAO secDao = new SecurityDAO();
		UserDAO userDao = new UserDAO();
		HttpSession se = request.getSession();
		
		if (request.getParameter("login") != null) {
			
				if (secDao.passwordsMatch(username, password)) {
					mav = new ModelAndView("accountHome");
					User user = userDao.findByUsername(username);
					se.setAttribute("user", user);
				}else {
					mav = new ModelAndView("logonForm");
					mav.addObject("message","Invalid credentials");
				}
			
		}else if (request.getParameter("register") != null) {
			if(secDao.isUserNameUnique(username)) {
				mav = new ModelAndView("register");
				mav.addObject("secId",new Security(username, password,"customer"));
			}else {
				mav = new ModelAndView("logonForm");
				mav.addObject("message", "Username already in use!" );
			}
		}
		
		return mav;
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request) {
		request.getSession().invalidate();
		ModelAndView mav = new ModelAndView("logonForm");
		mav.addObject("message", "You've been successfully logged out");
		return mav;
	}
}