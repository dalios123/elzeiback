package com.example.app.javatechie.spring.auth.example.monthlydata;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import com.example.app.javatechie.spring.auth.example.CRA.CRA;
import com.example.app.javatechie.spring.auth.example.client.Client;
import com.example.app.javatechie.spring.auth.example.mission.Mission;
import com.example.app.javatechie.spring.auth.example.salaries.Salaries;


@Entity
@Table(name = "monthlyData") // Corrected placement
public class monthlyData implements Serializable {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "salariesid")
    private Salaries salariesid;
    
    @OneToOne
    @JoinColumn(name = "missionid")
    private Mission missionid;
    
    @OneToOne
    @JoinColumn(name = "craid")
    private CRA craid;

    @Column(name = "facture") 
    private String facture;

    @Column(name = "autre") 
    private String autre;

    @Column(name = "totalPercu") 
    private String totalPercu;

    @Column(name = "cout")
    private String cout;
    
    @Column(name = "fraisrepas")
    private String fraisrepas;
    
    @Column(name = "fraiskilo")
    private String fraiskilo;
    
    @Column(name = "chargesalarial")
    private String chargesalarial;
    
    @Column(name = "chargeannexe")
    private String chargeannexe;

    
    
    
    public monthlyData () {}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Salaries getSalariesid() {
		return salariesid;
	}




	public void setSalariesid(Salaries salariesid) {
		this.salariesid = salariesid;
	}




	public Mission getMissionid() {
		return missionid;
	}




	public void setMissionid(Mission missionid) {
		this.missionid = missionid;
	}




	public CRA getCraid() {
		return craid;
	}




	public void setCraid(CRA craid) {
		this.craid = craid;
	}




	public String getFacture() {
		return facture;
	}




	public void setFacture(String facture) {
		this.facture = facture;
	}




	public String getAutre() {
		return autre;
	}




	public void setAutre(String autre) {
		this.autre = autre;
	}




	public String getTotalPercu() {
		return totalPercu;
	}




	public void setTotalPercu(String totalPercu) {
		this.totalPercu = totalPercu;
	}




	public String getCout() {
		return cout;
	}




	public void setCout(String cout) {
		this.cout = cout;
	}




	public String getFraisrepas() {
		return fraisrepas;
	}




	public void setFraisrepas(String fraisrepas) {
		this.fraisrepas = fraisrepas;
	}




	public String getFraiskilo() {
		return fraiskilo;
	}




	public void setFraiskilo(String fraiskilo) {
		this.fraiskilo = fraiskilo;
	}




	public String getChargesalarial() {
		return chargesalarial;
	}




	public void setChargesalarial(String chargesalarial) {
		this.chargesalarial = chargesalarial;
	}




	public String getChargeannexe() {
		return chargeannexe;
	}




	public void setChargeannexe(String chargeannexe) {
		this.chargeannexe = chargeannexe;
	}




	@Override
	public String toString() {
		return "monthlyData [id=" + id + ", salariesid=" + salariesid + ", missionid=" + missionid + ", craid=" + craid
				+ ", facture=" + facture + ", autre=" + autre + ", totalPercu=" + totalPercu + ", cout=" + cout
				+ ", fraisrepas=" + fraisrepas + ", fraiskilo=" + fraiskilo + ", chargesalarial=" + chargesalarial
				+ ", chargeannexe=" + chargeannexe + ", getId()=" + getId() + ", getSalariesid()=" + getSalariesid()
				+ ", getMissionid()=" + getMissionid() + ", getCraid()=" + getCraid() + ", getFacture()=" + getFacture()
				+ ", getAutre()=" + getAutre() + ", getTotalPercu()=" + getTotalPercu() + ", getCout()=" + getCout()
				+ ", getFraisrepas()=" + getFraisrepas() + ", getFraiskilo()=" + getFraiskilo()
				+ ", getChargesalarial()=" + getChargesalarial() + ", getChargeannexe()=" + getChargeannexe()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}




	public monthlyData(int id, Salaries salariesid, Mission missionid, CRA craid, String facture, String autre,
			String totalPercu, String cout, String fraisrepas, String fraiskilo, String chargesalarial,
			String chargeannexe) {
		super();
		this.id = id;
		this.salariesid = salariesid;
		this.missionid = missionid;
		this.craid = craid;
		this.facture = facture;
		this.autre = autre;
		this.totalPercu = totalPercu;
		this.cout = cout;
		this.fraisrepas = fraisrepas;
		this.fraiskilo = fraiskilo;
		this.chargesalarial = chargesalarial;
		this.chargeannexe = chargeannexe;
	}

    
}