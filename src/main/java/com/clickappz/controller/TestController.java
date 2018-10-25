/**
 * 
 */
package com.clickappz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author consumerfed
 *
 */
@Controller
@RequestMapping(value="/")
public class TestController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView test() {
		System.out.println(" sample");
		ModelAndView mv = new ModelAndView(" sample program ");
		return mv;
		
	}

}
