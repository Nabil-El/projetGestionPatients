package com.example.demo.RendezVous;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RendezVousController {
	@Autowired
    private RendezVousServices rendezVousServices;
	@RequestMapping(value = "/saveRDV",method = RequestMethod.POST)
     public RendezVous saveRendezVous(@RequestBody RendezVous rendezVous) {
	 return rendezVousServices.saveRendezVous(rendezVous);
       }
	@RequestMapping(value = "/deleteRDV",method = RequestMethod.DELETE)
     public void deleteRendezVousById(long id) {
		rendezVousServices.deleteRendezVousById(id);
 }
	@RequestMapping(value = "/getAllRDV",method = RequestMethod.GET)
 public Iterable<RendezVous> getAllRendezVous(){
	 return rendezVousServices.getAllRendezVous();
 }

}
