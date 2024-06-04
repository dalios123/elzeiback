package com.example.app.javatechie.spring.auth.example.mission;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import com.example.app.javatechie.spring.auth.example.client.Client;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;



@Entity
@Table(name = "Mission") // Corrected placement

public class Mission implements Serializable {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
	
	  @Column(name = "codemission") // Specify the column name for "cout"
	    private String codemission;

    @Column(name = "datedebut") // Specify the column name for "cout"
    private String datedebut;

    @Column(name = "datefin") // Specify the column name for "tjm"
    private String datefin;

    @Column(name = "tjm") // Specify the column name for "qt"
    private String tjm;
    
    @OneToOne
    @JoinColumn(name = "clientid")
    private Client clientid;
    
    @OneToMany
    private List<Salaries> salariesid;
    
    
    public Mission () {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCodemission() {
		return codemission;
	}


	public void setCodemission(String codemission) {
		this.codemission = codemission;
	}


	public String getDatedebut() {
		return datedebut;
	}


	public void setDatedebut(String datedebut) {
		this.datedebut = datedebut;
	}


	public String getDatefin() {
		return datefin;
	}


	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}


	public String getTjm() {
		return tjm;
	}


	public void setTjm(String tjm) {
		this.tjm = tjm;
	}


	public Client getClientid() {
		return clientid;
	}


	public void setClientid(Client clientid) {
		this.clientid = clientid;
	}


	public List<Salaries> getSalariesid() {
		return salariesid;
	}


	public void setSalariesid(List<Salaries> salariesid) {
		this.salariesid = salariesid;
	}


	@Override
	public String toString() {
		return "Mission [id=" + id + ", codemission=" + codemission + ", datedebut=" + datedebut + ", datefin="
				+ datefin + ", tjm=" + tjm + ", clientid=" + clientid + ", salariesid=" + salariesid + ", getId()="
				+ getId() + ", getCodemission()=" + getCodemission() + ", getDatedebut()=" + getDatedebut()
				+ ", getDatefin()=" + getDatefin() + ", getTjm()=" + getTjm() + ", getClientid()=" + getClientid()
				+ ", getSalariesid()=" + getSalariesid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	public Mission(int id, String codemission, String datedebut, String datefin, String tjm, Client clientid,
			List<Salaries> salariesid) {
		super();
		this.id = id;
		this.codemission = codemission;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.tjm = tjm;
		this.clientid = clientid;
		this.salariesid = salariesid;
	}

	
}

	