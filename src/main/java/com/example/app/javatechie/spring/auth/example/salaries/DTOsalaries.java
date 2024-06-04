package com.example.app.javatechie.spring.auth.example.salaries;

public class DTOsalaries {
	
	    public int id;
	    public String prenom;
	    public String nom;
	    public String dateNaiss;
	    public String adresse;
	    public String pays;
		public String matricule;
	    public String numSS;
	    public String dateEntre;
	    public String dateSortie;
	    public String emploi;
	    public String statut;
	    public String position;
	    public String coefficient;
	    
	    
	    public DTOsalaries () {}

		public int getId() {
			return id;
		}

		public void setId(int id) {
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

		public String getDateNaiss() {
			return dateNaiss;
		}

		public void setDateNaiss(String dateNaiss) {
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
			return "DTOsalaries [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", dateNaiss=" + dateNaiss
					+ ", adresse=" + adresse + ", pays=" + pays + ", matricule=" + matricule + ", numSS=" + numSS
					+ ", dateEntre=" + dateEntre + ", dateSortie=" + dateSortie + ", emploi=" + emploi + ", statut="
					+ statut + ", position=" + position + ", coefficient=" + coefficient + ", getId()=" + getId()
					+ ", getPrenom()=" + getPrenom() + ", getNom()=" + getNom() + ", getDateNaiss()=" + getDateNaiss()
					+ ", getAdresse()=" + getAdresse() + ", getPays()=" + getPays() + ", getMatricule()="
					+ getMatricule() + ", getNumSS()=" + getNumSS() + ", getDateEntre()=" + getDateEntre()
					+ ", getDateSortie()=" + getDateSortie() + ", getEmploi()=" + getEmploi() + ", getStatut()="
					+ getStatut() + ", getPosition()=" + getPosition() + ", getCoefficient()=" + getCoefficient()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
		public DTOsalaries(int id, String prenom, String nom, String dateNaiss, String adresse, String pays,
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

	
		

	
	
}