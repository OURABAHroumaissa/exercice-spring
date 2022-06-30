package com.example.exercicespring.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.sql.Date;
import java.util.List;

/**
 * Classe fille  formateur qui herite de personne
 * @author roumaissa
 */
@Entity
@Table(name = "formateur")
@DiscriminatorValue("Formateur")
public class Formateur extends Personne{
    @Column(name = "dateembache")
    private Date dateEmbauche;
    @Column
    private int experience;
    @Column
    private boolean interne;
    @ManyToMany@JoinTable(name="competence",uniqueConstraints=@UniqueConstraint(columnNames={ "FORMATEUR_ID", "MATIERE_ID" }),joinColumns=@JoinColumn(name="FORMATEUR_ID", referencedColumnName="id"),inverseJoinColumns=@JoinColumn(name="MATIERE_ID", referencedColumnName="id"))
    private List<Matiere> matieres;

    public Formateur() {
    }

    public Formateur(int id, String nom, String prenom, String email, Adresse adresse, String civilite, Date dateEmbauche, int experience) {
        super(id, nom, prenom, email, adresse, civilite);
        this.dateEmbauche = dateEmbauche;
        this.experience = experience;
    }

    public Formateur(int id, String nom, String prenom, String email, Adresse adresse, String civilite, Date dateEmbauche, int experience, boolean interne, List<Matiere> matieres) {
        super(id, nom, prenom, email, adresse, civilite);
        this.dateEmbauche = dateEmbauche;
        this.experience = experience;
        this.interne = interne;
        this.matieres = matieres;
    }

    public boolean isInterne() {
        return interne;
    }

    public void setInterne(boolean interne) {
        this.interne = interne;
    }

    public List<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<Matiere> matieres) {
        this.matieres = matieres;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Formateur{" +
                "dateEmbauche=" + dateEmbauche +
                ", experience=" + experience +
                '}';
    }
}
