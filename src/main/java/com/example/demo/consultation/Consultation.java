package com.example.demo.consultation;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.patient.Patient;
@Entity
@Table(name = "Consultation")
public class Consultation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name ="Date")
private Date dateConsultation;
@Column(name ="description")
private String description;
@ManyToOne
private Patient patient;


public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getDateConsultation() {
	return dateConsultation;
}
public void setDateConsultation(Date dateConsultation) {
	this.dateConsultation = dateConsultation;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Consultation() {
	super();
	// TODO Auto-generated constructor stub
}
public Consultation(Long id, Date dateConsultation) {
	super();
	this.id = id;
	this.dateConsultation = dateConsultation;
}



}
