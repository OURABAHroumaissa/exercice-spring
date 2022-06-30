package com.example.exercicespring.repository;


import com.example.exercicespring.entite.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFormateurRepo extends JpaRepository<Formateur,Integer> {
    public List<Formateur> findByNom(String nom);

}
