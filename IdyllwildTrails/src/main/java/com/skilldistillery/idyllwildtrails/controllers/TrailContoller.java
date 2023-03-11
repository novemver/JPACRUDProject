package com.skilldistillery.idyllwildtrails.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.idyllwildtrails.data.TrailDAO;
import com.skilldistillery.idyllwildtrails.entities.Trail;

@Controller
public class TrailContoller {

	@Autowired
	private TrailDAO trailDao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String goHome(Model model) {
		model.addAttribute("trail", trailDao.findAll());
		return "home";
	}
	
	@RequestMapping(path= {"display.do"})
	public String showTrail(Integer id, Model model) {
		Trail trail = trailDao.findById(id);
		model.addAttribute("trail", trail);
		return "trail/display";
	}
//	@RequestMapping(path= {"addTrail.do"})
//	public String newMenu(Integer id, Model model) {
//		Trail trail = trailDao.findById(id);
//		model.addAttribute("trail", trail);
//		return "home";
//	}
	
	@RequestMapping(path = "addTrail.do")
	public String addMenu(Trail trail, RedirectAttributes redir) {
		
		 trailDao.create(trail);
	
		 redir.addAttribute("trail", trail);
	
		return "trail/addTrail";
	}
//	@RequestMapping(path = {"addTrail.do"})
//	public ModelAndView addTrail(Trail trail, RedirectAttributes redir) {
//		
//		trailDao.create(trail);
//		ModelAndView mv = new ModelAndView();
//		redir.addFlashAttribute("trail", trail);
//		mv.setViewName("home");
//		return mv;
//	}

	
}
