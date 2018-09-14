package com.langmore.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.langmore.DAO.InventoryDAO;
import com.langmore.model.Inventory;

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
}
