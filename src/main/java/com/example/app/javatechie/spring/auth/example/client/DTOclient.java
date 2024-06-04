package com.example.app.javatechie.spring.auth.example.client;

public class DTOclient {
	
	    public int id;
	    public String libelle;
	    public String numtva;
	    public String address;
	    public String pays;
	    
	    
	    public DTOclient () {}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getLibelle() {
			return libelle;
		}


		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}


		public String getNumtva() {
			return numtva;
		}


		public void setNumtva(String numtva) {
			this.numtva = numtva;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getPays() {
			return pays;
		}


		public void setPays(String pays) {
			this.pays = pays;
		}


		@Override
		public String toString() {
			return "DTOclient [id=" + id + ", libelle=" + libelle + ", numtva=" + numtva + ", address=" + address
					+ ", pays=" + pays + ", getId()=" + getId() + ", getLibelle()=" + getLibelle() + ", getNumtva()="
					+ getNumtva() + ", getAddress()=" + getAddress() + ", getPays()=" + getPays() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}


		public DTOclient(int id, String libelle, String numtva, String address, String pays) {
			super();
			this.id = id;
			this.libelle = libelle;
			this.numtva = numtva;
			this.address = address;
			this.pays = pays;
		}

	    
	    
	    
	   
}
