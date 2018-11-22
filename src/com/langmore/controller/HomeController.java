package com.langmore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;

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
import com.langmore.services.EmailSender;

@Controller
public class HomeController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getIndex() {
		return "index";
	}
	
	 @RequestMapping("/error")
	 public String getError(){
	     return "internalServer";
	 }
	
	@RequestMapping(value="/availRooms", method=RequestMethod.GET)
	public ModelAndView getAvailRooms() {
		ModelAndView mav = new ModelAndView("availRooms");
		InventoryDAO inv = new InventoryDAO();
		List<Inventory> invList = inv.getAvailRooms();
		mav.addObject("inventory",invList);
		return mav;
	}
	
	@RequestMapping(value="/getDetail", method=RequestMethod.GET)
	public ModelAndView getRoomDetail(@RequestParam("id") String room) {
		ModelAndView mav = new ModelAndView("roomDetail"); 
		InventoryDAO inv = new InventoryDAO();
		
		mav.addObject("room", inv.getItemInfo(room));
		return mav;
	}
	
	@RequestMapping(value="/book", method=RequestMethod.POST)
	public ModelAndView postBooking(HttpServletRequest request) {
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
	public ModelAndView getQuoteForm() {
		return new ModelAndView("requestQuote");
	}
	
	@RequestMapping(value="/processQuote", method=RequestMethod.POST)
	public ModelAndView postQuoteForm(HttpServletRequest request) {
		String sender = (String) request.getParameter("email");
		String message = (String) request.getParameter("desc");
		EmailSender.sendEmail(sender, message);
		return new ModelAndView("requestQuote");
	}
	
	@RequestMapping(value="/accountHome", method=RequestMethod.POST)
	public ModelAndView postLogin(@RequestParam("username") String username,
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
	public ModelAndView getLogout(HttpServletRequest request) {
		request.getSession().invalidate();
		ModelAndView mav = new ModelAndView("logonForm");
		mav.addObject("message", "You've been successfully logged out");
		return mav;
	}
}