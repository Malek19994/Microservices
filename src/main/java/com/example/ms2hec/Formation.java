package com.example.ms2hec;



import javax.persistence.*;
import java.util.Collection;

@Entity
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private int duree;
    @OneToMany(mappedBy = "formation")
    private Collection<Etudiant> etudiants;

    public Formation() {
    }

    public Formation(String nom, int duree) {
        this.nom = nom;
        this.duree = duree;
    }

    public long getId() {
        return id;
    }




    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Collection<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Collection<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
