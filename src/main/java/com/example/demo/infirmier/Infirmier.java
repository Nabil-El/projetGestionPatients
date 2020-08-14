package com.example.demo.infirmier;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.example.demo.document.Document;

import com.example.demo.medecin.Medecin;

@Entity
public class Infirmier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long infirmierID;
	private String infirmierName;
	@ManyToOne
	@JoinColumn
	private Medecin medecin;
	
	/*
	 * @OneToMany
	 * 
	 * @JoinColumn private Collection<Document> document;
	 */
	
	public Long getInfirmierID() {
		return infirmierID;
	}
	public void setInfirmierID(Long infirmierID) {
		this.infirmierID = infirmierID;
	}
	public String getInfirmierName() {
		return infirmierName;
	}
	public void setInfirmierName(String infirmierName) {
		this.infirmierName = infirmierName;
	}
	public Infirmier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Infirmier(Long infirmierID, String infirmierName) {
		super();
		this.infirmierID = infirmierID;
		this.infirmierName = infirmierName;
	}
	
	
}
