package com.example.demo.infirmier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InfirmierServices {
	 @Autowired
	    private InfirmierRepository infirmierRepository;
	 public Infirmier saveInfirmier(Infirmier infirmier) {
		 return infirmierRepository.save(infirmier);
	 }
	 public void deleteInfirmierById(long infirmierID) {
		 infirmierRepository.deleteById(infirmierID);
	 }
	 public Iterable<Infirmier> getAllInfirmier(){
		 return infirmierRepository.findAll();
	 }
	  
	 
		
	  

	  


}
