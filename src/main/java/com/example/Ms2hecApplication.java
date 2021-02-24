package com.example;

import com.example.ms2hec.Etudiant;
import com.example.ms2hec.EtudiantRepository;
import com.example.ms2hec.Formation;
import com.example.ms2hec.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class Ms2hecApplication  implements CommandLineRunner {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private FormationRepository formationRepository;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(Ms2hecApplication.class, args);
    }

    @Override
    public void run(String... args)  throws Exception {

          repositoryRestConfiguration.exposeIdsFor(Formation.class,Etudiant.class);

//        Formation f1 = formationRepository.save(new Formation("PHP",30));
//        Formation f2 = formationRepository.save(new Formation("Oracle",15));
//        Formation f3 = formationRepository.save(new Formation("3fat",999));
//
//        Etudiant e1 = new Etudiant("malek","kabsi",new Date(),f1);
//        Etudiant e2 = new Etudiant("nigrou","ka7la",new Date(),f2);
//        Etudiant e3 = new Etudiant("3arbi","ta7an",new Date(),f3);
//        etudiantRepository.save(e1);
//        etudiantRepository.save(e2);
//        etudiantRepository.save(e3);
    }

}
