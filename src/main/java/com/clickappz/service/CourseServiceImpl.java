/**
 * 
 */
package com.clickappz.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clickappz.dao.CourseDAOImpl;
import com.clickappz.enums.TransactionEnum;
import com.clickappz.model.CourseDetail;

/**
 * @author nijesh
 *
 */
@Service
@Transactional
public class CourseServiceImpl implements CourseServiceInf {
	
	private CourseDAOImpl courseDAOImpl;
	
	

	public CourseDAOImpl getCourseDAOImpl() {
		return courseDAOImpl;
	}

	@Autowired
	public void setCourseDAOImpl(CourseDAOImpl courseDAOImpl) {
		this.courseDAOImpl = courseDAOImpl;
	}

	/* (non-Javadoc)
	 * @see com.clickappz.service.CourseServiceInf#createCourse(com.clickappz.model.CourseDetail)
	 */
	public TransactionEnum createCourse(CourseDetail course) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.clickappz.service.CourseServiceInf#removeCourse(int)
	 */
	public TransactionEnum removeCourse(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.clickappz.service.CourseServiceInf#getAvailableCourses()
	 */
	public List<CourseDetail> getAvailableCourses() {
		// TODO Auto-generated method stub
		
		return getCourseDAOImpl().getAvailableCourses();
	}

	/* (non-Javadoc)
	 * @see com.clickappz.service.CourseServiceInf#updateCourse(com.clickappz.model.CourseDetail)
	 */
	public TransactionEnum updateCourse(CourseDetail course) {
		// TODO Auto-generated method stub
		return getCourseDAOImpl().updateCourse(course);
	}

}
