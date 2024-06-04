package com.example.app.javatechie.spring.auth.example.salaries;

import jakarta.persistence.*;

@Entity
@Table(name = "Salaries")
public class Salaries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "nom")
    private String nom;

    @Column(name = "dateNaiss")
    private String dateNaiss;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "pays")
    private String pays;

    @Column(name = "matricule")
    private String matricule;

    @Column(name = "numSS")
    private String numSS;

    @Column(name = "dateEntre")
    private String dateEntre;

    @Column(name = "dateSortie")
    private String dateSortie;

    @Column(name = "emploi")
    private String emploi;
    @Lob
    @Column(name = "statut",columnDefinition = "TEXT")
    private String statut;

    @Column(name = "position")
    private String position;

    
    @Column(name = "coefficient")
    private String coefficient;
    


	
	 
    public Salaries(Integer id, String prenom, String nom, String dateNaiss, String adresse, String pays,
			String matricule, String numSS, String dateEntre, String dateSortie, String emploi, String statut,
			String position, String coefficient) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaiss = dateNaiss;
		this.adresse = adresse;
		this.pays = pays;
		this.matricule = matricule;
		this.numSS = numSS;
		this.dateEntre = dateEntre;
		this.dateSortie = dateSortie;
		this.emploi = emploi;
		this.statut = statut;
		this.position = position;
		this.coefficient = coefficient;
	}


	public Salaries() {
   	 
    }
   

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getdateNaiss() {
        return dateNaiss;
    }

    public void setdateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    

    public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public String getDateEntre() {
        return dateEntre;
    }

    public void setDateEntre(String dateEntre) {
        this.dateEntre = dateEntre;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }

    public String getEmploi() {
        return emploi;
    }

    public void setEmploi(String emploi) {
        this.emploi = emploi;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(String coefficient) {
        this.coefficient = coefficient;
    }


	@Override
	public String toString() {
		return "Salaries [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", dateNaiss=" + dateNaiss + ", adresse="
				+ adresse + ", pays=" + pays + ", matricule=" + matricule + ", numSS=" + numSS + ", dateEntre="
				+ dateEntre + ", dateSortie=" + dateSortie + ", emploi=" + emploi + ", statut=" + statut + ", position="
				+ position + ", coefficient=" + coefficient + ", getId()=" + getId() + ", getPrenom()=" + getPrenom()
				+ ", getNom()=" + getNom() + ", getdateNaiss()=" + getdateNaiss() + ", getAdresse()=" + getAdresse()
				+ ", getPays()=" + getPays() + ", getMatricule()=" + getMatricule() + ", getNumSS()=" + getNumSS()
				+ ", getDateEntre()=" + getDateEntre() + ", getDateSortie()=" + getDateSortie() + ", getEmploi()="
				+ getEmploi() + ", getStatut()=" + getStatut() + ", getPosition()=" + getPosition()
				+ ", getCoefficient()=" + getCoefficient() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
    
}
