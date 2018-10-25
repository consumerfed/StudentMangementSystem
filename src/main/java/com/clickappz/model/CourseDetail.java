package com.clickappz.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the course_details database table.
 * 
 */
@Entity
@Table(name="course_details")
public class CourseDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="course_id")
	private int courseId;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="course_created")
	private Date courseCreated;

	@Column(name="course_created_by")
	private int courseCreatedBy;

	@Column(name="course_description")
	private String courseDescription;

	@Column(name="course_duration")
	private int courseDuration;

	@Column(name="course_eligiblity")
	private String courseEligiblity;

	@Column(name="course_max_age")
	private int courseMaxAge;

	@Column(name="course_min_age")
	private int courseMinAge;

	@Column(name="course_name")
	private String courseName;

	@Column(name="course_status")
	private String courseStatus;

	@Column(name="course_strength")
	private int courseStrength;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="course_updated")
	private Date courseUpdated;

	//bi-directional many-to-one association to StudentCourseDetail
	@OneToMany(mappedBy="courseDetail")
	private Set<StudentCourseDetail> studentCourseDetails;

    public CourseDetail() {
    }

	public int getCourseId() {
		return this.courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public Date getCourseCreated() {
		return this.courseCreated;
	}

	public void setCourseCreated(Date courseCreated) {
		this.courseCreated = courseCreated;
	}

	public int getCourseCreatedBy() {
		return this.courseCreatedBy;
	}

	public void setCourseCreatedBy(int courseCreatedBy) {
		this.courseCreatedBy = courseCreatedBy;
	}

	public String getCourseDescription() {
		return this.courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public int getCourseDuration() {
		return this.courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public String getCourseEligiblity() {
		return this.courseEligiblity;
	}

	public void setCourseEligiblity(String courseEligiblity) {
		this.courseEligiblity = courseEligiblity;
	}

	public int getCourseMaxAge() {
		return this.courseMaxAge;
	}

	public void setCourseMaxAge(int courseMaxAge) {
		this.courseMaxAge = courseMaxAge;
	}

	public int getCourseMinAge() {
		return this.courseMinAge;
	}

	public void setCourseMinAge(int courseMinAge) {
		this.courseMinAge = courseMinAge;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseStatus() {
		return this.courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	public int getCourseStrength() {
		return this.courseStrength;
	}

	public void setCourseStrength(int courseStrength) {
		this.courseStrength = courseStrength;
	}

	public Date getCourseUpdated() {
		return this.courseUpdated;
	}

	public void setCourseUpdated(Date courseUpdated) {
		this.courseUpdated = courseUpdated;
	}

	public Set<StudentCourseDetail> getStudentCourseDetails() {
		return this.studentCourseDetails;
	}

	public void setStudentCourseDetails(Set<StudentCourseDetail> studentCourseDetails) {
		this.studentCourseDetails = studentCourseDetails;
	}
	
}