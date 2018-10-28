package com.clickappz.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clickappz.enums.TransactionEnum;
import com.clickappz.model.CourseDetail;

@Repository
public class CourseDAOImpl implements CourseDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public TransactionEnum createCourse(CourseDetail course) {
		// TODO Auto-generated method stub
		return null;
	}

	public TransactionEnum removeCourse(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<CourseDetail> getAvailableCourses() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(CourseDetail.class);
		List<CourseDetail> courseList = criteria.list();
		return courseList;
	}

	public TransactionEnum updateCourse(CourseDetail course) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(course);
		return null;
	}}
