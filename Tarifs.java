package Taxi;

public class Tarifs {
	
	private int departement;
	private double priseEnCharge;
	private double tarifKmSemaine;
	private double tarifHoraireSemaine;
	private double tarifKmDimanche;
	private double tarifHoraireDimanche;
	
	//Accesseurs & modifieurs
	public int getDepartement() {
		return departement;
	}
	public void setDepartement(int D) {
		this.departement=D;
	}
	
	public double getPriseEnCharge() {
		return priseEnCharge;
	}
	public void setPriseEnCharge(double P) {
		this.priseEnCharge=P;
	}
	
	public double getTarifKmSemaine() {
		return tarifKmSemaine;
	}
	public void setTarifKmSemaine(double TarifKmSem) {
		this.tarifKmSemaine=TarifKmSem;
	}
	
	public double getTarifHoraireSemaine() {
		return tarifHoraireSemaine;
	}
	public void setTarifHoraireSemaine(double TarifHorSem) {
		this.tarifHoraireSemaine=TarifHorSem;
	}
	
	public double getTarifKmDimanche() {
		return tarifKmDimanche;
	}
	public void setTarifKmDimanche(double TarifKmDim) {
		this.tarifKmDimanche=TarifKmDim;
	}
	
	public double getTarifHoraireDimanche() {
		return tarifHoraireDimanche;
	}
	public void setTarifHoraireDimanche(double TarifHorDim) {
		this.tarifHoraireDimanche=TarifHorDim;
	}
	

	//Constructeur
	public Tarifs(int D, double P, double TarifKmSem, double TarifHorSem, double TarifKmDim, double TarifHorDim) {
		this.departement=D;
		this.priseEnCharge=P;
		this.tarifKmSemaine=TarifKmSem;
		this.tarifHoraireSemaine=TarifHorSem;
		this.tarifKmDimanche=TarifKmDim;
		this.tarifHoraireDimanche=TarifHorDim;
	}
	
}
