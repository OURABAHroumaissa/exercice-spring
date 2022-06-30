package com.example.exercicespring.entite;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Classe matiere enseigner par les formaterus
 * @author roumaissa
 */
@Entity
@Table(name = "matiere")
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    @Size(max=100)
    private String nom;
    @Column
    private int duree;
    @Column
    @Size(max=20)
    private String difficulte;
    @ManyToMany@JoinTable(name="competence",uniqueConstraints=@UniqueConstraint(columnNames={ "FORMATEUR_ID", "MATIERE_ID" }),joinColumns=@JoinColumn(name="FORMATEUR_ID", referencedColumnName="id"),inverseJoinColumns=@JoinColumn(name="MATIERE_ID", referencedColumnName="id"))
    private List<Formateur> formateurs;

    public Matiere() {
    }

    public Matiere(int id, String nom, int duree, String difficulte) {
        this.id = id;
        this.nom = nom;
        this.duree = duree;
        this.difficulte = difficulte;
    }

    public Matiere(int id, String nom, int duree, String difficulte, List<Formateur> formateurs) {
        this.id = id;
        this.nom = nom;
        this.duree = duree;
        this.difficulte = difficulte;
        this.formateurs = formateurs;
    }

    public List<Formateur> getFormateurs() {
        return formateurs;
    }

    public void setFormateurs(List<Formateur> formateurs) {
        this.formateurs = formateurs;
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

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", duree=" + duree +
                ", difficulte='" + difficulte + '\'' +
                '}';
    }
}
