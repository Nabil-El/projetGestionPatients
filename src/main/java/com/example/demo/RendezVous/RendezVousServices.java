package com.example.demo.RendezVous;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RendezVousServices {
	@Autowired
    private RendezVousRepository rendezVousRepository;
	
     public RendezVous saveRendezVous(RendezVous rendezVous) {
	 return rendezVousRepository.save(rendezVous);
       }
     public void deleteRendezVousById(long id) {
    	 rendezVousRepository.deleteById(id);
 }
 public Iterable<RendezVous> getAllRendezVous(){
	 return rendezVousRepository.findAll();
 }


}
