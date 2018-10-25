package com.clickappz.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the student_course_details database table.
 * 
 */
@Entity
@Table(name="student_course_details")
public class StudentCourseDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="student_course_id")
	private int studentCourseId;

	//bi-directional many-to-one association to StudentDetail
    @ManyToOne
	@JoinColumn(name="student_id")
	private StudentDetail studentDetail;

	//bi-directional many-to-one association to CourseDetail
    @ManyToOne
	@JoinColumn(name="course_id")
	private CourseDetail courseDetail;

    public StudentCourseDetail() {
    }

	public int getStudentCourseId() {
		return this.studentCourseId;
	}

	public void setStudentCourseId(int studentCourseId) {
		this.studentCourseId = studentCourseId;
	}

	public StudentDetail getStudentDetail() {
		return this.studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}
	
	public CourseDetail getCourseDetail() {
		return this.courseDetail;
	}

	public void setCourseDetail(CourseDetail courseDetail) {
		this.courseDetail = courseDetail;
	}
	
}