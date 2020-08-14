package com.example.demo.medecin;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Medecin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Medecin;
	private String medecin_name;
	//@OneToMany 
	//private Collection<Consultation> consultation;
	public Long getId_Medecin() {
		return Id_Medecin;
	}
	public void setId_Medecin(Long id_Medecin) {
		Id_Medecin = id_Medecin;
	}
	public String getMedecin_name() {
		return medecin_name;
	}
	public void setMedecin_name(String medecin_name) {
		this.medecin_name = medecin_name;
	}
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medecin(Long id_Medecin) {
		super();
		Id_Medecin = id_Medecin;
	}
	

}
