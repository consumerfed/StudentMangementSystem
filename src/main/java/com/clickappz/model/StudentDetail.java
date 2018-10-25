package com.clickappz.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the student_details database table.
 * 
 */
@Entity
@Table(name="student_details")
public class StudentDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="student_id")
	private int studentId;

	@Column(name="student_address")
	private String studentAddress;

    @Temporal( TemporalType.DATE)
	@Column(name="student_dob")
	private Date studentDob;

	@Column(name="student_father_name")
	private String studentFatherName;

	@Column(name="student_name")
	private String studentName;

	@Column(name="student_qualification")
	private String studentQualification;

	@Column(name="student_roll_no")
	private String studentRollNo;

	@Column(name="student_status")
	private String studentStatus;

	//bi-directional many-to-one association to StudentCourseDetail
	@OneToMany(mappedBy="studentDetail")
	private Set<StudentCourseDetail> studentCourseDetails;

    public StudentDetail() {
    }

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentAddress() {
		return this.studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Date getStudentDob() {
		return this.studentDob;
	}

	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}

	public String getStudentFatherName() {
		return this.studentFatherName;
	}

	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentQualification() {
		return this.studentQualification;
	}

	public void setStudentQualification(String studentQualification) {
		this.studentQualification = studentQualification;
	}

	public String getStudentRollNo() {
		return this.studentRollNo;
	}

	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentStatus() {
		return this.studentStatus;
	}

	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}

	public Set<StudentCourseDetail> getStudentCourseDetails() {
		return this.studentCourseDetails;
	}

	public void setStudentCourseDetails(Set<StudentCourseDetail> studentCourseDetails) {
		this.studentCourseDetails = studentCourseDetails;
	}
	
}