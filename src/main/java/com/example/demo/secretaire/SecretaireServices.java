package com.example.demo.secretaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SecretaireServices {
	@Autowired
    private SecretaireRepository secretaireRepository;
	
     public Secretaire saveSecretaire(Secretaire secretaire) {
	 return secretaireRepository.save(secretaire);
       }
     public void deleteSecretaireById(long id) {
    	 secretaireRepository.deleteById(id);
 }
 public Iterable<Secretaire> getAllSecretaire(){
	 return secretaireRepository.findAll();
 }
}
