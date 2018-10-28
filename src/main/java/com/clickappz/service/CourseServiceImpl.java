/**
 * 
 */
package com.clickappz.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.clickappz.dao.CourseDAOImpl;
import com.clickappz.dao.CourseDAO;
import com.clickappz.enums.TransactionEnum;
import com.clickappz.model.CourseDetail;

/**
 * @author nijesh
 *
 */
@Service
@Transactional
public class CourseServiceImpl implements CourseService {
	
	
	private CourseDAO courseDAO;

	
	@Autowired
	public void setCourseDAO(CourseDAO courseDAO) {
		this.courseDAO = courseDAO;
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
		
		return courseDAO.getAvailableCourses();
	}

	/* (non-Javadoc)
	 * @see com.clickappz.service.CourseServiceInf#updateCourse(com.clickappz.model.CourseDetail)
	 */
	public TransactionEnum updateCourse(CourseDetail course) {
		// TODO Auto-generated method stub
		return courseDAO.updateCourse(course);
	}

}
