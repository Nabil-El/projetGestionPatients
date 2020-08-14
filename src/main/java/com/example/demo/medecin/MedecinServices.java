package com.example.demo.medecin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MedecinServices {
	@Autowired
    private MedecinRepository medecinRepository;
 public Medecin saveMedecin(Medecin medecin) {
	 return medecinRepository.save(medecin);
 }
 public void deleteMedecinByN(long id) {
	 medecinRepository.deleteById(id);
 }
 public Iterable<Medecin> getAllMedecin(){
	 return medecinRepository.findAll();
 }

}
