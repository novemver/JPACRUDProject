package com.skilldistillery.idyllwildtrails.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.skilldistillery.idyllwildtrails.data.TrailDAO;
import com.skilldistillery.idyllwildtrails.entities.Trail;

@Controller
public class TrailContoller {

	@Autowired
	private TrailDAO trailDao;

	@RequestMapping(path = { "/", "home.do" })
	public String goHome(Model model) {
		model.addAttribute("trail", trailDao.findAll());
		return "home";
	}

	@RequestMapping(path = { "display.do" })
	public String showTrail(Integer id, Model model) {
		Trail trail = trailDao.findById(id);
		model.addAttribute("trail", trail);
		return "trail/display";
	}

	@RequestMapping(path = "addTrail.do", method = RequestMethod.GET)
	public String addForm(Trail trail, Model model) {
		return "trail/addTrail";
	}

	@RequestMapping(path = "addTrail.do", method = RequestMethod.POST)
	public ModelAndView persistTrail(Trail trail, Model model) {
		trailDao.create(trail);
		ModelAndView mv = new ModelAndView();
		model.addAttribute("trail", trailDao.findAll());
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(path = "updateThisTrail.do", method = RequestMethod.GET)
	public String upTrail(Trail trail, Model model) {
		return "trail/updateTrail";
	}

	@RequestMapping(path = "update.do", method = RequestMethod.POST)
	public ModelAndView updateTrail(Trail trail, Model model) {

		trailDao.update(trail.getId(), trail);
		ModelAndView mv = new ModelAndView();
		model.addAttribute("trail", trail);
		mv.setViewName("trail/display");
		return mv;
	}

	@RequestMapping(path = "removeThisTrail.do", method = RequestMethod.GET)
	public String removeTrail(Trail trail, Model model) {
		trailDao.deleteById(trail.getId());
		model.addAttribute("trail", trail);
		return "trail/removed";
	}

//	@Autowired
//	private TrailDAO trailDao;
//
//	@RequestMapping(path = { "/", "home.do" })
//	public String goHome(Model model) {
//		model.addAttribute("trail", trailDao.findAll());
//		return "home";
//	}
//
//	@RequestMapping(path = { "display.do" })
//	public String showTrail(Integer id, Model model) {
//		Trail trail = trailDao.findById(id);
//		model.addAttribute("trail", trail);
//		return "trail/display";
//	}
//
//	@RequestMapping(path = "addTrail.do", method = RequestMethod.GET)
//	public String addForm(Trail trail, Model model) {
//		return "trail/addTrail";
//	}
//
//	@RequestMapping(path = "addTrail2.do", method = RequestMethod.POST)
//	public ModelAndView persistTrail(Trail trail, Model model) {
//		trailDao.create(trail);
//		ModelAndView mv = new ModelAndView();
//		model.addAttribute("trail", trailDao.findAll());
//		mv.setViewName("home");
//		return mv;
//	}
//	
//	@RequestMapping(path= "updateThisTrail.do", method = RequestMethod.GET)
//	public String upTrail(Trail trail, Model model) {
//		return "trail/updateTrail";
//	} 
//	
//	@RequestMapping(path = "update.do", method = RequestMethod.POST)
//	public ModelAndView updateTrail(Trail trail, @RequestParam int id) {
//		
//		trailDao.update(id, trail);
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("trail", trail);
//		mv.setViewName("trail/display");
//		return mv;
//	}
////	@RequestMapping(path = "update.do", method = RequestMethod.POST)
////	public ModelAndView updateTrail(Trail trail, Model model) {
////		
////		trailDao.update(trail.getId(), trail);
////		ModelAndView mv = new ModelAndView();
////		model.addAttribute("trail", trail);
////		mv.setViewName("trail/display");
////		return mv;
////	}
//
//	@RequestMapping(path = "removeThisTrail.do", method = RequestMethod.GET)
//	public String removeTrail(Trail trail, Model model) {
//		trailDao.deleteById(trail.getId());
//		model.addAttribute("trail", trail);
//		return "trail/removed";
//	}

}
