package com.example.demo.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PatientServices  {
	@Autowired
    private PatientRepository patientRepository;
	
     public Patient savePatient(Patient patient) {
	 return patientRepository.save(patient);
       }
     public void deletePatientById(long id) {
	 patientRepository.deleteById(id);
 }
 public Iterable<Patient> getAllPatient(){
	 return patientRepository.findAll();
 }

	/*
	 * @Override public List<Patient> findAll() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public List<Patient> findAll(Sort sort) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public List<Patient> findAllById(Iterable<Long> ids) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public <S extends Patient> List<S> saveAll(Iterable<S> entities) {
	 * // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public void flush() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public <S extends Patient> S saveAndFlush(S entity) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public void deleteInBatch(Iterable<Patient> entities) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void deleteAllInBatch() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public Patient getOne(Long id) { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * @Override public <S extends Patient> List<S> findAll(Example<S> example) { //
	 * TODO Auto-generated method stub return null; }
	 * 
	 * @Override public <S extends Patient> List<S> findAll(Example<S> example, Sort
	 * sort) { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public Page<Patient> findAll(Pageable pageable) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public <S extends Patient> S save(S entity) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public Optional<Patient> findById(Long id) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public boolean existsById(Long id) { // TODO Auto-generated method
	 * stub return false; }
	 * 
	 * @Override public long count() { // TODO Auto-generated method stub return 0;
	 * }
	 * 
	 * @Override public void deleteById(Long id) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 * 
	 * @Override public void delete(Patient entity) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 * 
	 * @Override public void deleteAll(Iterable<? extends Patient> entities) { //
	 * TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void deleteAll() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public <S extends Patient> Optional<S> findOne(Example<S> example)
	 * { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public <S extends Patient> Page<S> findAll(Example<S> example,
	 * Pageable pageable) { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override public <S extends Patient> long count(Example<S> example) { // TODO
	 * Auto-generated method stub return 0; }
	 * 
	 * @Override public <S extends Patient> boolean exists(Example<S> example) { //
	 * TODO Auto-generated method stub return false; }
	 * 
	 */}
