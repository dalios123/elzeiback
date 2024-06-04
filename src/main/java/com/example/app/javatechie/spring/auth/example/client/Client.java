package com.example.app.javatechie.spring.auth.example.client;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Client") // Corrected placement
public class Client implements Serializable {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "libelle") // Specify the column name for "cout"
    private String libelle;

    @Column(name = "numtva") // Specify the column name for "tjm"
    private String numtva;

    @Column(name = "address") // Specify the column name for "qt"
    private String address;

    @Column(name = "pays") // Specify the column name for "factureHt"
    private String pays;
    
    
    
    public Client () {}



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



	public Client(int id, String libelle, String numtva, String address, String pays) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.numtva = numtva;
		this.address = address;
		this.pays = pays;
	}



	@Override
	public String toString() {
		return "Client [id=" + id + ", libelle=" + libelle + ", numtva=" + numtva + ", address=" + address + ", pays="
				+ pays + ", getId()=" + getId() + ", getLibelle()=" + getLibelle() + ", getNumtva()=" + getNumtva()
				+ ", getAddress()=" + getAddress() + ", getPays()=" + getPays() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

    
    
    
}