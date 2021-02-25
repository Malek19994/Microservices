package com.example.ms2hec;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository <Etudiant ,Long> {
    public List<Etudiant> findByNomStartsWith( String nom);
}
