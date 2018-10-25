/**
 * 
 */
package com.clickappz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.clickappz.model.CourseDetail;
import com.clickappz.service.CourseServiceImpl;
import com.clickappz.service.CourseServiceInf;

/**
 * @author itsection
 *
 */
@Controller
@RequestMapping(value="/course")
public class CourseController {
	@Autowired
	private CourseServiceInf courseServiceInf;



	@RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("courseForm") CourseDetail course){
		courseServiceInf.createCourse(course);
	  return new ModelAndView("redirect:/course/list");
	 }
	

	@RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
		
	  ModelAndView model = new ModelAndView("course/list");
	  List list = courseServiceInf.getAvailableCourses();
	  model.addObject("list", list);
	  return model;
	 }
	

}
