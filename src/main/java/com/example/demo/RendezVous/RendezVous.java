package com.example.demo.RendezVous;


import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;

import com.example.demo.consultation.Consultation;


@Entity

public class RendezVous {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_rdv;
	private Date date_Rdv;
	
	
	 
	public Long getId_rdv() {
		return Id_rdv;
	}
	public void setId_rdv(Long id_rdv) {
		Id_rdv = id_rdv;
	}
	public Date getDate_Rdv() {
		return date_Rdv;
	}
	public void setDate_Rdv(Date date_Rdv) {
		this.date_Rdv = date_Rdv;
	}
	public RendezVous() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RendezVous(Long id_rdv, Date date_Rdv) {
		super();
		Id_rdv = id_rdv;
		this.date_Rdv = date_Rdv;
	}
	 

}
