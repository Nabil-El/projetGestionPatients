package com.example.demo.consultation;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConsultationServices {

	  @Autowired
	    private ConsultationRepository consultationRepository;
	  
	  public Consultation saveConsultation(Consultation consultation) {
	    return consultationRepository.save(consultation);
	  }
	  
	  public void deleteConsultationById(long id) {
		  consultationRepository.deleteById(id);
	  }
	  
	  public Iterable<Consultation> getAllConsultation(){
	    return consultationRepository.findAll();
	  }
	  
		/*
		 * public Consultation getConsultationByDate1(Date date) {
		 * Optional<Consultation> consultation = consultationRepository.findById(id);
		 * return consultation.get(); }
		 */
      
	  public Consultation updateConsultation(long id, Consultation consultation) {
	    try {      
	      Consultation consultation1 = consultationRepository.findById(id).get();
	      consultation1.setDateConsultation(consultation.getDateConsultation());
	      consultation1.setDescription(consultation.getDescription());
	      
	      return consultationRepository.save(consultation1);
	    } catch (Exception e) {
	      throw new Error("update unsuccessful!");
	    }
	  }

	/*  public Consultation getConsultationByDate(Date date) {
	    return consultationRepository.findByDay(date);*/
	  }

	  

