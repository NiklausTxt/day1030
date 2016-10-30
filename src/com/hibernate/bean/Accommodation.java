package com.hibernate.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "accommodation")
@Entity
public class Accommodation {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="create_datetime")
	private Date createTime;
	
	@Column(name="expired_datetime")
	private Date expriedTime;
	
	@ManyToOne
	@JoinColumn(name= "apartment_id")
	private Apartment apartment;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Date getCreateTime() {
		return createTime;
	}



	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}



	public Date getExpriedTime() {
		return expriedTime;
	}



	public void setExpriedTime(Date expriedTime) {
		this.expriedTime = expriedTime;
	}



	public Apartment getApartment() {
		return apartment;
	}



	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	@Override
	public String toString() {
		return "Accommodation [id=" + id + ", createTime=" + createTime + ", expriedTime=" + expriedTime
				+"]";
	}
	
	
	
}
