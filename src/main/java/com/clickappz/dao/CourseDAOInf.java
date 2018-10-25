/**
 * 
 */
package com.clickappz.dao;

import java.util.List;

import com.clickappz.model.CourseDetail;
import com.clickappz.enums.TransactionEnum;

/**
 * @author nijesh
 *
 */
public interface CourseDAOInf {
	
	public TransactionEnum createCourse(CourseDetail course);
	public TransactionEnum removeCourse(int courseId);
	public List<CourseDetail> getAvailableCourses();
	public TransactionEnum updateCourse(CourseDetail course);

}
