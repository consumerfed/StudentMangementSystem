/**
 * 
 */
package com.clickappz.dao;

import java.util.List;

import com.clickappz.model.StudentDetail;
import com.clickappz.enums.TransactionEnum;

/**
 * @author itsection
 *
 */
public interface StudentDAO {
	
	
	public TransactionEnum registerStudent();
	public TransactionEnum blockStudent(String rollNo);
	public TransactionEnum updateStudentDetails(StudentDetail student);
	public List<StudentDetail> getStudentList();
	
	

}
