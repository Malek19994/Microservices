package com.example.ms2hec;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface FormationRepository extends JpaRepository<Formation ,Long> {

}
