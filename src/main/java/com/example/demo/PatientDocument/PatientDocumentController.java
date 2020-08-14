/*
 * package com.example.demo.PatientDocument;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.example.demo.document.Document;
 * 
 * @RestController
 * 
 * @RequestMapping("/alldocument") public class PatientDocumentController {
 * 
 * @Autowired private PatientDocumentServices patientDocumentServices;
 * 
 * @GetMapping("/{idpatient}") public List<Document>
 * findDocumentByIdPatient(@PathVariable Long idpatient) { return
 * patientDocumentServices.findDocumentByIdPatient(idpatient); }
 * 
 * 
 * }
 */
