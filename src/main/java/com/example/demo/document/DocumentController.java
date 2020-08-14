package com.example.demo.document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DocumentController {
	@Autowired
	private DocumentServices documentServices;
	@RequestMapping(value = "/saveDocument",method = RequestMethod.POST)
	public Document saveDocument(Document document) {
	    return documentServices.saveDocument(document);
	  }
	@RequestMapping(value = "/getDocument",method = RequestMethod.GET)
	public void getDocumentById(long id) {
		documentServices.getDocumentById(id);
	  }
	@RequestMapping(value = "/getAllDocument",method = RequestMethod.GET)
	public Iterable<Document> getAllDocument(){
	    return documentServices.getAllDocument();
	  }
	  

}
