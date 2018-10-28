/**
 * 
 */
package com.clickappz.view;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.clickappz.model.CourseDetail;
import com.clickappz.service.CourseService;

/**
 * @author nijesh
 *
 */

@ManagedBean(name="courseView")
@ViewScoped
public class CourseView implements Serializable {
	
	@ManagedProperty(value="#{courseService}")
	CourseService courseService;
	
	private List<CourseDetail> courses;
	
	
	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	public List<CourseDetail> getCourses() {
		return courses;
	}

	public void setCourses(List<CourseDetail> courses) {
		this.courses = courses;
	}
	
	public List<CourseDetail> getAvailableCourses(){
		courses = getCourseService().getAvailableCourses();
		return courses;
	}
	

}
