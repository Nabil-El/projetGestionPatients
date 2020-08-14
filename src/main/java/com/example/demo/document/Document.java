package com.example.demo.document;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.example.demo.consultation.Consultation;
import com.example.demo.infirmier.Infirmier;
import com.example.demo.patient.Patient;
@Entity
public class Document {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomPatient;
	public String getNomPatient() {
		return nomPatient;
	}
	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}
	private Date date;
	private String description;
	
	@ManyToOne
	private Patient patient;
	@ManyToOne
	private Infirmier infirmier;
	public Document(Long id) {
		super();
		this.id = id;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
