package com.hibernate.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "registeration")
@Entity
public class Registeration {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "major_id")
	private Major major;
	
	@ManyToOne
	@JoinColumn(name = "academy_year_id")
	private AcademyYear academyYear;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public AcademyYear getAcademyYear() {
		return academyYear;
	}

	public void setAcademyYear(AcademyYear academyYear) {
		this.academyYear = academyYear;
	}
	
	
	
}
