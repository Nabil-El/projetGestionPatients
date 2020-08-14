package com.example.demo.consultation;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ConsultationController {
	@Autowired
    private ConsultationServices consultationServices;
  @RequestMapping(value = "/saveConsultation",method = RequestMethod.POST)
  public Consultation saveConsultation(@RequestBody Consultation consultation) {
    return consultationServices.saveConsultation(consultation);
  }
  
  @RequestMapping(value = "/deleteConsultation/{id}",method = RequestMethod.DELETE)
  public void deleteConsultationById(@PathVariable Long id) {
	  consultationServices.deleteConsultationById(id);
  }
  @RequestMapping(value = "/consultations",method = RequestMethod.GET)
  public Iterable<Consultation> getAllConsultation(){
    return consultationServices.getAllConsultation();
  }
  @RequestMapping(value = "/UpdateConsultation/{id}",method = RequestMethod.PUT)
  public Consultation updateConsultation(@PathVariable Long id, @RequestBody Consultation consultation) {
    return consultationServices.updateConsultation(id, consultation);
  }
	
}
