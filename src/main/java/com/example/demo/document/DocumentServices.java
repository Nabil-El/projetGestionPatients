package com.example.demo.document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DocumentServices {
	 @Autowired
	    private DocumentRepository documentRepository;
	  
	  public Document saveDocument(Document document) {
	    return documentRepository.save(document);
	  }
	  public void getDocumentById(long id) {
		  documentRepository.getOne(id);
	  }
	  public void deleteDocumentById(long id) {
		  documentRepository.deleteById(id);
	  }
	  public String getNomPatient(long id) {
		  Document document2 = documentRepository.findById(id).get();
		  return document2.getNomPatient();
		  //return documentRepository.getNomPatient();
	  }
	  
	  public Iterable<Document> getAllDocument(){
		  
	    return documentRepository.findAll();
	  }
	 /* public Iterable<Document> getDocumentByName(){
		  documentRepository.getOne(id)
		    return documentRepository.findAll();
		  }
*/
		/*
		 * public Iterable<Document> findAllByNomPatient(String nomPatient){ Document=
		 * return documentRepository.findById(id).get();
		 * 
		 * }
		 */
	  public Document updateDocument(long id, Document document) {
	    try {      
	    	Document document1 = documentRepository.findById(id).get();
	    	document1.setDate(document.getDate());
	    	document1.setDescription(document.getDescription());
	      
	      return documentRepository.save(document1);
	    } catch (Exception e) {
	      throw new Error("update unsuccessful!");
	    }
	  }

	
	  }

	  



