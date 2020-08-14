package com.example.demo.infirmier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface InfirmierRepository extends JpaRepository<Infirmier, Long>{
	

}
