package com.example.app.javatechie.spring.auth.example.CRA;

import com.example.app.javatechie.spring.auth.example.mission.Mission;

public class DTOCRA {
	
	public int id;
    public String mois;
    public String nbjour;
    public String montantH;
    public String montantTTC;
    public Mission missionid;
    
    
    public DTOCRA () {}


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


	public Mission getMissionid() {
		return missionid;
	}


	public void setMissionid(Mission missionid) {
		this.missionid = missionid;
	}


	@Override
	public String toString() {
		return "DTOCRA [id=" + id + ", mois=" + mois + ", nbjour=" + nbjour + ", montantH=" + montantH + ", montantTTC="
				+ montantTTC + ", missionid=" + missionid + ", getId()=" + getId() + ", getMois()=" + getMois()
				+ ", getNbjour()=" + getNbjour() + ", getMontantH()=" + getMontantH() + ", getMontantTTC()="
				+ getMontantTTC() + ", getMissionid()=" + getMissionid() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public DTOCRA(int id, String mois, String nbjour, String montantH, String montantTTC, Mission missionid) {
		super();
		this.id = id;
		this.mois = mois;
		this.nbjour = nbjour;
		this.montantH = montantH;
		this.montantTTC = montantTTC;
		this.missionid = missionid;
	}


    
    
}