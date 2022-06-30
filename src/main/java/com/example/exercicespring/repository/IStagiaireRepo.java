package com.example.exercicespring.repository;


import com.example.exercicespring.entite.Adresse;
import com.example.exercicespring.entite.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface IStagiaireRepo extends JpaRepository<Stagiaire,Integer> {

    public List<Stagiaire> findByDateNaissance(Date date);
    @Query("select gt from Stagiaire gt left join gt.formateur g where g.nom = :nomformateur")
    public List<Stagiaire> findByFormateur(@Param("nomformateur") String nom);

}
