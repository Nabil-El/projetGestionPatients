package com.example.demo.secretaire;

import java.util.Collection;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import com.example.demo.patient.Patient;
@Entity

public class Secretaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID ;
	private String Name;
	private Long numero ;
	
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Secretaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Secretaire(Long iD, String name) {
		super();
		ID = iD;
		Name = name;
	}
	

}
