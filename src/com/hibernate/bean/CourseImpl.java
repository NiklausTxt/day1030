package com.hibernate.bean;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="course_impl")
public class CourseImpl {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="capacity")
	private int capacity;
	
	@Column(name="remains")
	private int remains;
	
	@Column(name="create_datetime")
	private Date createTime;
	
	@ManyToOne
	@JoinColumn(name="course_template_id")
	private CourseTemplate courseTemplate;
	
	@ManyToOne
	@JoinColumn(name="lecturer_id")
	private Lecturer lecturer;
	
	@OneToMany
	@JoinColumn(name="course_impl_id")
	private Set<Enrollment> enrollments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getRemains() {
		return remains;
	}

	public void setRemains(int remains) {
		this.remains = remains;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public CourseTemplate getCourseTemplate() {
		return courseTemplate;
	}

	public void setCourseTemplate(CourseTemplate courseTemplate) {
		this.courseTemplate = courseTemplate;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

	public Set<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(Set<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}

	
	
}
