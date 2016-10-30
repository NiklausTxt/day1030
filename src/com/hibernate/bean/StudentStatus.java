package com.hibernate.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.CallbackException;
import org.hibernate.Session;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.classic.Lifecycle;

@Entity
@Table(name = "student_status")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class StudentStatus{
	@Id
	@Column(name="id")
	private int id;
	@Column(name="code")
	private String code;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	
	@OneToMany
	@JoinColumn(name = "student_status_id")
	private Set<Student> students;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "StudentStatus [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description + "]";
	}
//	@Override
//	public boolean onDelete(Session arg0) throws CallbackException {
//		System.out.println("onDelete...");
//		return false;
//	}
//	@Override
//	public void onLoad(Session arg0, Serializable arg1) {
//		System.out.println("onLoad...");
//		
//	}
//	@Override
//	public boolean onSave(Session arg0) throws CallbackException {
//		System.out.println("onSave...");
//		return false;
//	}
//	@Override
//	public boolean onUpdate(Session arg0) throws CallbackException {
//		System.out.println("onUpdate...");
//		return false;
//	}
//	
}
