package com.example.demo.medecin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {
	

}
