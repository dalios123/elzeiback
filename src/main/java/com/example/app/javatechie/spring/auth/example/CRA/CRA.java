package com.example.app.javatechie.spring.auth.example.CRA;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import com.example.app.javatechie.spring.auth.example.mission.Mission;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;
@Entity
@Table(name = "CRA") // Corrected placement
public class CRA  implements Serializable  {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "mois") // Specify the column name for "cout"
    private String mois;

    @Column(name = "nbjour") // Specify the column name for "tjm"
    private String nbjour;
    
    @Column(name = "montantH") // Specify the column name for "tjm"
    private String montantH;
    
    @Column(name = "montantTTC") // Specify the column name for "tjm"
    private String montantTTC;
    
    @ManyToOne
    @JoinColumn(name = "missionid")
    private Mission mission;
    
    
  
    
    public CRA () {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMois() {
		return mois;
	}


	public void setMois(String mois) {
		this.mois = mois;
	}


	public String getNbjour() {
		return nbjour;
	}


	public void setNbjour(String nbjour) {
		this.nbjour = nbjour;
	}


	public String getMontantH() {
		return montantH;
	}


	public void setMontantH(String montantH) {
		this.montantH = montantH;
	}


	public String getMontantTTC() {
		return montantTTC;
	}


	public void setMontantTTC(String montantTTC) {
		this.montantTTC = montantTTC;
	}


	public Mission getMission() {
		return mission;
	}


	public void setMission(Mission mission) {
		this.mission = mission;
	}


	@Override
	public String toString() {
		return "CRA [id=" + id + ", mois=" + mois + ", nbjour=" + nbjour + ", montantH=" + montantH + ", montantTTC="
				+ montantTTC + ", mission=" + mission + ", getId()=" + getId() + ", getMois()=" + getMois()
				+ ", getNbjour()=" + getNbjour() + ", getMontantH()=" + getMontantH() + ", getMontantTTC()="
				+ getMontantTTC() + ", getMission()=" + getMission() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	public CRA(int id, String mois, String nbjour, String montantH, String montantTTC, Mission mission) {
		super();
		this.id = id;
		this.mois = mois;
		this.nbjour = nbjour;
		this.montantH = montantH;
		this.montantTTC = montantTTC;
		this.mission = mission;
	}


	
    
    
}
