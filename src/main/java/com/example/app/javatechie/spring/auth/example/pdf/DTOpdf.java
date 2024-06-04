package com.example.app.javatechie.spring.auth.example.pdf;

public class DTOpdf {
	    public int id;
	    public String periode;
	    public String matricule;
	    public String numSS;
	    public String Salairebrut;
	    public String Totaldescotisationsetcontributions;
	    public String Netapayeravantimpotsurlerevenu;
	    public String Netpaye;
	    public String chpatroniales;
	    public String nom;
	    public String emploi;
	    public String statut;
	    public String position;
	    public String coefficient;
	    
	    
	    
		public String getPeriode() {
			return periode;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
			return Netapayeravantimpotsurlerevenu;
		}
		public void setNetapayeravantimpotsurlerevenu(String netapayeravantimpotsurlerevenu) {
			Netapayeravantimpotsurlerevenu = netapayeravantimpotsurlerevenu;
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
		public DTOpdf(int id, String periode, String matricule, String numSS, String salairebrut,
				String totaldescotisationsetcontributions, String netapayeravantimpotsurlerevenu, String netpaye,
				String chpatroniales, String nom, String emploi, String statut, String position, String coefficient) {
			super();
			this.id = id;
			this.periode = periode;
			this.matricule = matricule;
			this.numSS = numSS;
			this.Salairebrut = salairebrut;
			this.Totaldescotisationsetcontributions = totaldescotisationsetcontributions;
			this.Netapayeravantimpotsurlerevenu = netapayeravantimpotsurlerevenu;
			this.Netpaye = netpaye;
			this.chpatroniales = chpatroniales;
			this.nom = nom;
			this.emploi = emploi;
			this.statut = statut;
			this.position = position;
			this.coefficient = coefficient;
		}
		@Override
		public String toString() {
			return "DTOpdf [id=" + id + ", periode=" + periode + ", matricule=" + matricule + ", numSS=" + numSS
					+ ", Salairebrut=" + Salairebrut + ", Totaldescotisationsetcontributions="
					+ Totaldescotisationsetcontributions + ", Netapayeravantimpotsurlerevenu="
					+ Netapayeravantimpotsurlerevenu + ", Netpaye=" + Netpaye + ", chpatroniales=" + chpatroniales
					+ ", nom=" + nom + ", emploi=" + emploi + ", statut=" + statut + ", position=" + position
					+ ", coefficient=" + coefficient + ", getPeriode()=" + getPeriode() + ", getId()=" + getId()
					+ ", getMatricule()=" + getMatricule() + ", getNumSS()=" + getNumSS() + ", getSalairebrut()="
					+ getSalairebrut() + ", getTotaldescotisationsetcontributions()="
					+ getTotaldescotisationsetcontributions() + ", getNetapayeravantimpôtsurlerevenu()="
					+ getNetapayeravantimpotsurlerevenu() + ", getNetpaye()=" + getNetpaye() + ", getChpatroniales()="
					+ getChpatroniales() + ", getNom()=" + getNom() + ", getEmploi()=" + getEmploi() + ", getStatut()="
					+ getStatut() + ", getPosition()=" + getPosition() + ", getCoefficient()=" + getCoefficient()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
		
		
		
	
}