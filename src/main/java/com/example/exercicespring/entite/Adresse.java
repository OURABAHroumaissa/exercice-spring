package com.example.exercicespring.entite;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Classe des adresses avec rue, ville et pays
 * @author roumaissa
 */
@Entity
@Table(name = "adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String rue;
    @Column
    private String complement;
    @Column
    @Size(max=10)
    private String zipcode;
    @Column
    @Size(max=100)
    private String ville;
    @Column
    @Size(max=100)
    private String country;
   /* @OneToMany
    private List<Personne> personnes;*/

    public Adresse() {
    }

    public Adresse(int id, String rue, String complement, String zipcode, String ville, String country) {
        this.id = id;
        this.rue = rue;
        this.complement = complement;
        this.zipcode = zipcode;
        this.ville = ville;
        this.country = country;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "id=" + id +
                ", rue='" + rue + '\'' +
                ", complement='" + complement + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", ville='" + ville + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
