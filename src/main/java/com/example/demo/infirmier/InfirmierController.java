package com.example.demo.infirmier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfirmierController {
	@Autowired
    private InfirmierServices infirmierServices;
	@RequestMapping(value = "/saveInfermier",method = RequestMethod.POST)
    public Infirmier saveInfirmier(Infirmier infirmier) {
	 return infirmierServices.saveInfirmier(infirmier);
 }
	@RequestMapping(value = "/deleteInfermier",method = RequestMethod.DELETE)
 public void deleteInfirmierById(long infirmierID) {
		infirmierServices.deleteInfirmierById(infirmierID);
 }
	@RequestMapping(value = "/getAllInfermier",method = RequestMethod.GET)
 public Iterable<Infirmier> getAllInfirmier(){
	 return infirmierServices.getAllInfirmier();
 }
}
