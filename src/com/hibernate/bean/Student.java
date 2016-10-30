package com.hibernate.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.CallbackException;
import org.hibernate.Session;
import org.hibernate.classic.Lifecycle;

@Table(name = "student")
@Entity
public class Student{
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "sid")
	private int sid;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
//	@Column(name = "student_status_id")
//	private int statusId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "student_status_id")
	private StudentStatus status;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private StudentLogin login;
	
	@OneToMany
	@JoinColumn(name="student_id")
	private Set<Accommodation> accommdations;
	
	@OneToMany
	@JoinColumn(name="student_id")
	private Set<Enrollment> enrollments;
	
	@OneToMany
	@JoinColumn(name="student_id")
	private Set<Registeration> registerrations;
	
	public Set<Accommodation> getAccommdations() {
		return accommdations;
	}
	public void setAccommdations(Set<Accommodation> accommdations) {
		this.accommdations = accommdations;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", phone=" + phone + ", email=" + email + ", dateOfBirth=" + dateOfBirth + "]";
	}
	public StudentLogin getLogin() {
		return login;
	}
	public void setLogin(StudentLogin login) {
		this.login = login;
	}
	public StudentStatus getStatus() {
		return status;
	}
	public void setStatus(StudentStatus status) {
		this.status = status;
	}
	public Set<Enrollment> getEnrollments() {
		return enrollments;
	}
	public void setEnrollments(Set<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}
	public Set<Registeration> getRegisterrations() {
		return registerrations;
	}
	public void setRegisterrations(Set<Registeration> registerrations) {
		this.registerrations = registerrations;
	}
	
	
	
}
