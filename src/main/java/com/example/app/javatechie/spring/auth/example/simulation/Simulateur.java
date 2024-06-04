package com.example.app.javatechie.spring.auth.example.simulation;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Simulateur") // Corrected placement
public class Simulateur implements Serializable {

 

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "cout") // Specify the column name for "cout"
    private double cout;

    @Column(name = "tjm") // Specify the column name for "tjm"
    private double tjm;

    @Column(name = "qt") // Specify the column name for "qt"
    private double qt;

    @Column(name = "facture_ht") // Specify the column name for "factureHt"
    private double factureHt;

    @Column(name = "dispo") // Specify the column name for "dispo"
    private double dispo;

   
    
    @Column(name = "astreintes") // Specify the column name for "Astreintes"
    private double astreintes;
    

    @Column(name = "qt2") // Specify the column name for "qt"
    private double qt2;

    @Column(name = "facture_ht2") // Specify the column name for "factureHt"
    private double factureHt2;

    @Column(name = "dispo2") // Specify the column name for "dispo"
    private double dispo2;
    
    @Column(name = "autres") // Specify the column name for "Astreintes"
    private double autres;
    

    @Column(name = "qt3") // Specify the column name for "qt"
    private double qt3;

    @Column(name = "facture_ht3") // Specify the column name for "factureHt"
    private double factureHt3;

    @Column(name = "dispo3") // Specify the column name for "dispo"
    private double dispo3;

    @Column(name = "total_dispoo") // Specify the column name for "totalDISPOO"
    private double totalDISPOO;

    // **Salaries and deductions:**
    @Column(name = "brut_ann") // Specify the column name for "BrutAnn"
    private double brutAnn;

    @Column(name = "salaire_brut") // Specify the column name for "SalaireBrut"
    private double salaireBrut; // Calculated value

    @Column(name = "salaire_net_hors_pas") // Specify the column name for "SalaireNetHorsPAS"
    private double salaireNetHorsPAS; // Calculated value

    @Column(name = "frais_repas") // Specify the column name for "FraisRepas"
    private double fraisRepas;

    @Column(name = "frais_kilo") // Specify the column name for "FraisKilo"
    private double fraisKilo;

    @Column(name = "autres_frais_sur_facture") // Specify the column name for "Autresfraissurfacture"
    private double autresFraisSurFacture;

    @Column(name = "total_percu_hors_extra") // Specify the column name for "TotalPerçuHorsExtra"
    private double totalPercuHorsExtra; // Calculated value

    // **Deductions:**
    @Column(name = "medecine_de_travail") // Specify the column name for "MedécinedeTravail"
    private double medecineDeTravail;

    @Column(name = "taxe_dapprentissage") // Specify the column name for "TaxeDapprentissage"
    private double taxeDapprentissage; // Calculated value

    @Column(name = "adessat") // Specify the column name for "Adessat"
    private double adessat; // Calculated value

    @Column(name = "taxe_cci") // Specify the column name for "TaxeCCI"
    private double taxeCCI; // Calculated value
    
    @Column(name = "continuue") // Specify the column name for "TaxeCCI"
    private double continuue; // Calculated value


    @Column(name = "assurance_resp_civile") // Specify the column name for "AssuranceRespCivile"
    private double assuranceRespCivile;

    @Column(name = "complement_mut_op1") // Specify the column name for "ComplémMutOp1"
    private double complementMutOp1;

    @Column(name = "cvae_sur_ca_genere") // Specify the column name for "CVAEsurCAgénéré"
    private double cvaeSurCAgenere; // Calculated value

    
    @Column(name = "Charges_Patronale_URSSAF") // Specify the column name for "CVAEsurCAgénéré"
    private double ChargesPatronalesURSSAF; // Calculated value
    
    
    @Column(name = "Charges_Salariales") // Specify the column name for "CVAEsurCAgénéré"
    private double ChargesSalariales; // Calculated value
    
    
    @Column(name = "Charges_Patronales_Ann") // Specify the column name for "CVAEsurCAgénéré"
    private double ChargesPatronalesAnn; // Calculated value
    
    
    @Column(name = "Coût_Total") // Specify the column name for "CVAEsurCAgénéré"
    private double CoutTotal; // Calculated value
    
    
    @Column(name = "Solde") // Specify the column name for "CVAEsurCAgénéré"
    private double Solde; // Calculated value
    
    
    @Column(name = "TotalPerçu") // Specify the column name for "CVAEsurCAgénéré"
    private double TotalPercu; // Calculated value
    
    
    @Column(name = "Extra_Possible_Hors_PAS") // Specify the column name for "CVAEsurCAgénéré"
    private double ExtraPossibleHorsPAS; // Calculated value

    
   
    
	public Simulateur(int id, double cout, double tjm, double qt, double factureHt, double dispo, double astreintes,
			double qt2, double factureHt2, double dispo2, double autres, double qt3, double factureHt3, double dispo3,
			double totalDISPOO, double brutAnn, double salaireBrut, double salaireNetHorsPAS, double fraisRepas,
			double fraisKilo, double autresFraisSurFacture, double totalPercuHorsExtra, double medecineDeTravail,
			double taxeDapprentissage, double adessat, double taxeCCI, double continuue, double assuranceRespCivile,
			double complementMutOp1, double cvaeSurCAgenere, double chargesPatronalesURSSAF, double chargesSalariales,
			double chargesPatronalesAnn, double CoutTotal, double solde, double TotalPercu,
			double extraPossibleHorsPAS) {
		super();
		this.id = id;
		this.cout = cout;
		this.tjm = tjm;
		this.qt = qt;
		this.factureHt = factureHt;
		this.dispo = dispo;
		this.astreintes = astreintes;
		this.qt2 = qt2;
		this.factureHt2 = factureHt2;
		this.dispo2 = dispo2;
		this.autres = autres;
		this.qt3 = qt3;
		this.factureHt3 = factureHt3;
		this.dispo3 = dispo3;
		this.totalDISPOO = totalDISPOO;
		this.brutAnn = brutAnn;
		this.salaireBrut = salaireBrut;
		this.salaireNetHorsPAS = salaireNetHorsPAS;
		this.fraisRepas = fraisRepas;
		this.fraisKilo = fraisKilo;
		this.autresFraisSurFacture = autresFraisSurFacture;
		this.totalPercuHorsExtra = totalPercuHorsExtra;
		this.medecineDeTravail = medecineDeTravail;
		this.taxeDapprentissage = taxeDapprentissage;
		this.adessat = adessat;
		this.taxeCCI = taxeCCI;
		this.continuue = continuue;
		this.assuranceRespCivile = assuranceRespCivile;
		this.complementMutOp1 = complementMutOp1;
		this.cvaeSurCAgenere = cvaeSurCAgenere;
		this.ChargesPatronalesURSSAF = chargesPatronalesURSSAF;
		this.ChargesSalariales = chargesSalariales;
		this.ChargesPatronalesAnn = chargesPatronalesAnn;
		this.CoutTotal = CoutTotal;
		this.Solde = solde;
		this.TotalPercu = TotalPercu;
		this.ExtraPossibleHorsPAS = extraPossibleHorsPAS;
	}
    
    
	 
    public Simulateur() {
   	 
    }
   
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}


	public double getCout() {
		return cout;
	}


	public void setCout(double cout) {
		this.cout = cout;
	}


	public double getTjm() {
		return tjm;
	}


	public void setTjm(double tjm) {
		this.tjm = tjm;
	}


	public double getQt() {
		return qt;
	}


	public void setQt(double qt) {
		this.qt = qt;
	}


	public double getFactureHt() {
		return factureHt;
	}


	public void setFactureHt(double factureHt) {
		this.factureHt = factureHt;
	}


	public double getDispo() {
		return dispo;
	}


	public void setDispo(double dispo) {
		this.dispo = dispo;
	}


	public double getAstreintes() {
		return astreintes;
	}


	public void setAstreintes(double astreintes) {
		this.astreintes = astreintes;
	}


	public double getQt2() {
		return qt2;
	}


	public void setQt2(double qt2) {
		this.qt2 = qt2;
	}


	public double getFactureHt2() {
		return factureHt2;
	}


	public void setFactureHt2(double factureHt2) {
		this.factureHt2 = factureHt2;
	}


	public double getDispo2() {
		return dispo2;
	}


	public void setDispo2(double dispo2) {
		this.dispo2 = dispo2;
	}


	public double getAutres() {
		return autres;
	}


	public void setAutres(double autres) {
		this.autres = autres;
	}


	public double getQt3() {
		return qt3;
	}


	public void setQt3(double qt3) {
		this.qt3 = qt3;
	}


	public double getFactureHt3() {
		return factureHt3;
	}


	public void setFactureHt3(double factureHt3) {
		this.factureHt3 = factureHt3;
	}


	public double getDispo3() {
		return dispo3;
	}


	public void setDispo3(double dispo3) {
		this.dispo3 = dispo3;
	}


	public double getTotalDISPOO() {
		return totalDISPOO;
	}


	public void setTotalDISPOO(double totalDISPOO) {
		this.totalDISPOO = totalDISPOO;
	}


	public double getBrutAnn() {
		return brutAnn;
	}


	public void setBrutAnn(double brutAnn) {
		this.brutAnn = brutAnn;
	}


	public double getSalaireBrut() {
		return salaireBrut;
	}


	public void setSalaireBrut(double salaireBrut) {
		this.salaireBrut = salaireBrut;
	}


	public double getSalaireNetHorsPAS() {
		return salaireNetHorsPAS;
	}


	public void setSalaireNetHorsPAS(double salaireNetHorsPAS) {
		this.salaireNetHorsPAS = salaireNetHorsPAS;
	}


	public double getFraisRepas() {
		return fraisRepas;
	}


	public void setFraisRepas(double fraisRepas) {
		this.fraisRepas = fraisRepas;
	}


	public double getFraisKilo() {
		return fraisKilo;
	}


	public void setFraisKilo(double fraisKilo) {
		this.fraisKilo = fraisKilo;
	}


	public double getAutresFraisSurFacture() {
		return autresFraisSurFacture;
	}


	public void setAutresFraisSurFacture(double autresFraisSurFacture) {
		this.autresFraisSurFacture = autresFraisSurFacture;
	}


	public double getTotalPercuHorsExtra() {
		return totalPercuHorsExtra;
	}


	public void setTotalPercuHorsExtra(double totalPercuHorsExtra) {
		this.totalPercuHorsExtra = totalPercuHorsExtra;
	}


	public double getMedecineDeTravail() {
		return medecineDeTravail;
	}


	public void setMedecineDeTravail(double medecineDeTravail) {
		this.medecineDeTravail = medecineDeTravail;
	}


	public double getTaxeDapprentissage() {
		return taxeDapprentissage;
	}


	public void setTaxeDapprentissage(double taxeDapprentissage) {
		this.taxeDapprentissage = taxeDapprentissage;
	}


	public double getAdessat() {
		return adessat;
	}


	public void setAdessat(double adessat) {
		this.adessat = adessat;
	}


	public double getTaxeCCI() {
		return taxeCCI;
	}


	public void setTaxeCCI(double taxeCCI) {
		this.taxeCCI = taxeCCI;
	}


	public double getContinuue() {
		return continuue;
	}


	public void setContinuue(double continuue) {
		this.continuue = continuue;
	}


	public double getAssuranceRespCivile() {
		return assuranceRespCivile;
	}


	public void setAssuranceRespCivile(double assuranceRespCivile) {
		this.assuranceRespCivile = assuranceRespCivile;
	}


	public double getComplementMutOp1() {
		return complementMutOp1;
	}


	public void setComplementMutOp1(double complementMutOp1) {
		this.complementMutOp1 = complementMutOp1;
	}


	public double getCvaeSurCAgenere() {
		return cvaeSurCAgenere;
	}


	public void setCvaeSurCAgenere(double cvaeSurCAgenere) {
		this.cvaeSurCAgenere = cvaeSurCAgenere;
	}


	public double getChargesPatronalesURSSAF() {
		return ChargesPatronalesURSSAF;
	}


	public void setChargesPatronalesURSSAF(double chargesPatronalesURSSAF) {
		ChargesPatronalesURSSAF = chargesPatronalesURSSAF;
	}


	public double getChargesSalariales() {
		return ChargesSalariales;
	}


	public void setChargesSalariales(double chargesSalariales) {
		ChargesSalariales = chargesSalariales;
	}


	public double getChargesPatronalesAnn() {
		return ChargesPatronalesAnn;
	}


	public void setChargesPatronalesAnn(double chargesPatronalesAnn) {
		ChargesPatronalesAnn = chargesPatronalesAnn;
	}


	public double getCoutTotal() {
		return CoutTotal;
	}


	public void setCoutTotal(double CoutTotal) {
		CoutTotal = CoutTotal;
	}


	public double getSolde() {
		return Solde;
	}


	public void setSolde(double solde) {
		Solde = solde;
	}


	public double getTotalPercu() {
		return TotalPercu;
	}


	public void setTotalPercu(double totalPerçu) {
		TotalPercu = TotalPercu;
	}


	public double getExtraPossibleHorsPAS() {
		return ExtraPossibleHorsPAS;
	}


	public void setExtraPossibleHorsPAS(double extraPossibleHorsPAS) {
		ExtraPossibleHorsPAS = extraPossibleHorsPAS;
	}	
    
}
