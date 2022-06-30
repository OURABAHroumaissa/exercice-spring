package com.example.exercicespring.entite;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
/**
 * Classe fille stagiaire qui herite de personne
 * @author roumaissa
 */
@Entity
@Table(name = "stagiaire")
@DiscriminatorValue("Stagiaire")
public class Stagiaire extends Personne{
    @Column(name = "datenaissance")
    @NotNull
    private Date dateNaissance;
    @OneToOne
    @NotNull
    private Formateur formateur;

    public Stagiaire() {
    }

    public Stagiaire(int id, String nom, String prenom, String email, Adresse adresse, String civilite, Date dateNaissance, Formateur formateur) {
        super(id, nom, prenom, email, adresse, civilite);
        this.dateNaissance = dateNaissance;
        this.formateur = formateur;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    @Override
    public String toString() {
        return "Stagiaire{" +
                "dateNaissance=" + dateNaissance +
                ", formateur=" + formateur +
                '}';
    }
}
