/**
 * 
 */
package com.clickappz.service;

import java.util.List;

import com.clickappz.enums.TransactionEnum;
import com.clickappz.model.CourseDetail;

/**
 * @author nijesh
 *
 */
public interface CourseService {
	
	public TransactionEnum createCourse(CourseDetail course);
	public TransactionEnum removeCourse(int courseId);
	public List<CourseDetail> getAvailableCourses();
	public TransactionEnum updateCourse(CourseDetail course);

}
