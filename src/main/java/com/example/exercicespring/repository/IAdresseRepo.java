package com.example.exercicespring.repository;


import com.example.exercicespring.entite.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IAdresseRepo extends JpaRepository<Adresse,Integer> {
    public List<Adresse> findByRue(String rue);
    public List<Adresse> findByZipcode(String codePostal);

}
