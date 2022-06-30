package com.example.exercicespring.repository;


import com.example.exercicespring.entite.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMatiereRepo extends JpaRepository<Matiere,Integer> {
    List<Matiere> findByNom(String model);
}
