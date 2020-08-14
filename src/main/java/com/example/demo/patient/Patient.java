package com.example.demo.patient;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


import com.example.demo.RendezVous.RendezVous;
import com.example.demo.document.Document;
import com.example.demo.secretaire.Secretaire;

@Entity
public class Patient {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id ;
private String nomPatient;
private String prenomPatient;
private Long numPatient;
public Long getNumPatient() {
	return numPatient;
}
public void setNumPatient(Long numPatient) {
	this.numPatient = numPatient;
}
public String getPrenomPatient() {
	return prenomPatient;
}
public void setPrenomPatient(String prenomPatient) {
	this.prenomPatient = prenomPatient;
}
@OneToMany
private Collection<RendezVous> rendezVous;
@OneToMany
private Collection<Document> document;

@ManyToOne
private Secretaire secretaire;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNomPatient() {
	return nomPatient;
}
public void setNomPatient(String nomPatient) {
	this.nomPatient = nomPatient;
}
public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
public Patient( String nomPatient) {
	super();
	
	this.nomPatient = nomPatient;
}

}
