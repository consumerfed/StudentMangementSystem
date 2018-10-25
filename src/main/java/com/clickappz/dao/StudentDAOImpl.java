/**
 * 
 */
package com.clickappz.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clickappz.enums.TransactionEnum;
import com.clickappz.model.StudentDetail;

/**
 * @author itsection
 *
 */
@Repository
public class StudentDAOImpl implements StudentDAOInf {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public TransactionEnum registerStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	public TransactionEnum blockStudent(String rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public TransactionEnum updateStudentDetails(StudentDetail student) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<StudentDetail> getStudentList() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(StudentDetail.class);
		return criteria.list();
	}}
