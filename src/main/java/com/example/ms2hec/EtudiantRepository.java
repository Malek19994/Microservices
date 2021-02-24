package com.example.ms2hec;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository <Etudiant ,Long> {
    public List<Etudiant> findByNomStartsWith( String nom);
}
