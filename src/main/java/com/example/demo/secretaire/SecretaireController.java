package com.example.demo.secretaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretaireController {
	@Autowired
    private SecretaireServices secretaireServices;
	@RequestMapping(value = "/saveSecretaire",method = RequestMethod.POST)
     public Secretaire saveSecretaire(Secretaire secretaire) {
	 return secretaireServices.saveSecretaire(secretaire);
       }
	@RequestMapping(value = "/deleteSecretaire",method = RequestMethod.DELETE)
     public void deleteSecretaireById(long id) {
		secretaireServices.deleteSecretaireById(id);
 }
	@RequestMapping(value = "/getAllSecretaire",method = RequestMethod.GET)
 public Iterable<Secretaire> getAllSecretaire(){
	 return secretaireServices.getAllSecretaire();
 }

}
