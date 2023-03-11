package com.skilldistillery.idyllwildtrails.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.idyllwildtrails.data.TrailDAO;

@Controller
public class TrailContoller {

	@Autowired
	private TrailDAO trailDao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String goHome(Model model) {
		model.addAttribute("trails", trailDao.findAll());
		return "home";
	}
	
	
}
