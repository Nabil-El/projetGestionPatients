package com.example.demo.medecin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedecinController {
	@Autowired
    private MedecinServices medecinServices;
	@RequestMapping(value = "/saveMedecin",method = RequestMethod.POST)
 public Medecin saveMedecin(Medecin medecin) {
	 return medecinServices.saveMedecin(medecin);
 }
	@RequestMapping(value = "/deleteMedecin",method = RequestMethod.DELETE)
 public void deleteMedecinByN(long id) {
		medecinServices.deleteMedecinByN(id);
 }
	@RequestMapping(value = "/getAllMedecin",method = RequestMethod.GET)
 public Iterable<Medecin> getAllMedecin(){
	 return medecinServices.getAllMedecin();
 }

}
