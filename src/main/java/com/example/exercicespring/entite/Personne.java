package com.example.exercicespring.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Classe mere de formateur et stagiaire
 * @author roumaissa
 */
@Entity
@Table(name = "personne")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PERSONNE")
public abstract class Personne {
    /**
     * id de personne
     */
    @Id
    private int id;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String email;

    @ManyToOne
    private Adresse adresse;
    @Column
    @Size(max=10)
    private String civilite;



    public Personne() {
    }

    public Personne(int id, String nom, String prenom, String email, Adresse adresse, String civilite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.civilite = civilite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }
}
