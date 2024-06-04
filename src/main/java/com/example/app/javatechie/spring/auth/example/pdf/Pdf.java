package com.example.app.javatechie.spring.auth.example.pdf;

import java.util.Arrays;



import jakarta.persistence.*;

	@Entity
	@Table(name = "pdf")
	public class Pdf {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	 @Column(name = "periode")
	 private String periode;
	 
	 
	 @Column(name = "matricule")
	 private String matricule;

	 
	 @Column(name = "numSS")
	 private String numSS;
	 
    
    @Column(name = "Salairebrut")
    private String Salairebrut;
 
    
    @Column(name = "Totaldescotisationsetcontributions")
    private String Totaldescotisationsetcontributions;
    
    
    @Column(name = "netapayeravantimpotsurlerevenu")
    private String netapayeravantimpotsurlerevenu;
    
    
    @Column(name = "Netpaye")
    private String Netpaye;
    
    @Column(name = "chpatroniales")
    private String chpatroniales;
    
    
    
    
    
    
    
    
    
    
    @Column(name = "nom")
    private String nom;
 
    
    @Column(name = "emploi")
    private String emploi;
    
    
    @Column(name = "statut")
    private String statut;
    
    
    @Column(name = "position")
    private String position;
    
    @Column(name = "coefficient")
    private String coefficient;
    
    
    
    public Pdf() {
   	 
    }
   

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
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

	public String getSalairebrut() {
		return Salairebrut;
	}

	public void setSalairebrut(String salairebrut) {
		Salairebrut = salairebrut;
	}

	public String getTotaldescotisationsetcontributions() {
		return Totaldescotisationsetcontributions;
	}

	public void setTotaldescotisationsetcontributions(String totaldescotisationsetcontributions) {
		Totaldescotisationsetcontributions = totaldescotisationsetcontributions;
	}

	public String getNetapayeravantimpotsurlerevenu() {
		return netapayeravantimpotsurlerevenu;
	}

	public void setNetapayeravantimpôtsurlerevenu(String netapayeravantimpotsurlerevenu) {
		this.netapayeravantimpotsurlerevenu = netapayeravantimpotsurlerevenu;
	}

	public String getNetpaye() {
		return Netpaye;
	}

	public void setNetpaye(String netpaye) {
		Netpaye = netpaye;
	}

	public String getChpatroniales() {
		return chpatroniales;
	}

	public void setChpatroniales(String chpatroniales) {
		this.chpatroniales = chpatroniales;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
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
		return "Pdf [id=" + id + ", periode=" + periode + ", matricule=" + matricule + ", numSS=" + numSS
				+ ", Salairebrut=" + Salairebrut + ", Totaldescotisationsetcontributions="
				+ Totaldescotisationsetcontributions + ", netapayeravantimpotsurlerevenu="
				+ netapayeravantimpotsurlerevenu + ", Netpaye=" + Netpaye + ", chpatroniales=" + chpatroniales
				+ ", nom=" + nom + ", emploi=" + emploi + ", statut=" + statut + ", position=" + position
				+ ", coefficient=" + coefficient + ", getId()=" + getId() + ", getPeriode()=" + getPeriode()
				+ ", getMatricule()=" + getMatricule() + ", getNumSS()=" + getNumSS() + ", getSalairebrut()="
				+ getSalairebrut() + ", getTotaldescotisationsetcontributions()="
				+ getTotaldescotisationsetcontributions() + ", getNetapayeravantimpôtsurlerevenu()="
				+ getNetapayeravantimpotsurlerevenu() + ", getNetpaye()=" + getNetpaye() + ", getChpatroniales()="
				+ getChpatroniales() + ", getNom()=" + getNom() + ", getEmploi()=" + getEmploi() + ", getStatut()="
				+ getStatut() + ", getPosition()=" + getPosition() + ", getCoefficient()=" + getCoefficient()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	public Pdf(Integer id, String periode, String matricule, String numSS, String salairebrut,
			String totaldescotisationsetcontributions, String netapayeravantimpôtsurlerevenu, String netpaye,
			String chpatroniales, String nom, String emploi, String statut, String position, String coefficient) {
		super();
		this.id = id;
		this.periode = periode;
		this.matricule = matricule;
		this.numSS = numSS;
		this.Salairebrut = salairebrut;
		this.Totaldescotisationsetcontributions = totaldescotisationsetcontributions;
		this.netapayeravantimpotsurlerevenu = netapayeravantimpotsurlerevenu;
		this.Netpaye = netpaye;
		this.chpatroniales = chpatroniales;
		this.nom = nom;
		this.emploi = emploi;
		this.statut = statut;
		this.position = position;
		this.coefficient = coefficient;
	}



	
    
    
    
	}
    
    
