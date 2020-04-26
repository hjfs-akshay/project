package com.eGalaxy.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSES")
public class Course {
	@Id
	@Column(name = "COURSE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public Course(String courseName, String courseAuthor, String courseDescription, long coursePrice) {
		super();
		this.courseName = courseName;
		this.courseAuthor = courseAuthor;
		this.courseDescription = courseDescription;
		this.coursePrice = coursePrice;
	}

	@Column(name = "COURSE_NAME" , nullable = false )
	private String courseName;
	
	@Column(name = "COURSE_AUTHOR" , nullable = false )
	private String courseAuthor;
	
	@Column(name = "COURSE_DESCRIPTION" , nullable = false )
	private String courseDescription;
	
	@Column(name = "COURSE_PRICE" , nullable = false )
	private long coursePrice;
	
	
	public Course()
	{
		
	}

	public long getId() {
		return id;
	}

	
	public void setId(long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseAuthor() {
		return courseAuthor;
	}

	public void setCourseAuthor(String courseAuthor) {
		this.courseAuthor = courseAuthor;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public long getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(long coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseAuthor=" + courseAuthor
				+ ", courseDescription=" + courseDescription + ", coursePrice=" + coursePrice + "]";
	}
}
