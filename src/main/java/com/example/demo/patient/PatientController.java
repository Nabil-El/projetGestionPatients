package com.example.demo.patient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	@Autowired
    private PatientServices patientServices;
	@RequestMapping(value = "/savePatient",method = RequestMethod.POST)
	 public Patient savePatient(Patient patient) {
		 return patientServices.savePatient(patient);
	       }
	@RequestMapping(value = "/deletePatient",method = RequestMethod.DELETE)
	     public void deletePatientById(long id) {
		patientServices.deletePatientById(id);
	 }
	@RequestMapping(value = "/patients",method = RequestMethod.GET)
	 public Iterable<Patient> getAllPatient(){
		 return patientServices.getAllPatient();
	 }
	
	}
	


