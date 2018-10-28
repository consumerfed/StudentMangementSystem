/**
 * 
 */
package com.clickappz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.clickappz.model.CourseDetail;
import com.clickappz.service.CourseService;
import com.clickappz.view.CourseView;

/**
 * @author itsection
 *
 */
@Controller
@RequestMapping(value="/course")
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	

	@RequestMapping(value="/save", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("courseForm") CourseDetail course){
		courseService.createCourse(course);
	  return new ModelAndView("redirect:/course/list");
	 }
	

	@RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list(){
		
	  ModelAndView model = new ModelAndView("course/list");
	  CourseView courseDetails = new CourseView();
	  List<CourseDetail> list = courseService.getAvailableCourses();
	  courseDetails.setCourses(list);
	  System.out.println(" course details size : "+list.size());
	  model.addObject("courseDetails", courseDetails);
	  return model;
	 }
	

}
