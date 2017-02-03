package org.springboot.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ViewController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView homepage(Model model){
		ModelAndView mav = new ModelAndView("index.html");
        return mav;
    }
}
