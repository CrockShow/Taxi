package Taxi;

public class Saisie {

	private int dept;
	private int nbKm;
	private String jour;
	private int duree;
	
	public int getDept() {
		return dept;
	}
	public void setDept(int D) {
		this.dept=D;
	}
	
	public int getNbKm() {
		return nbKm;
	}
	public void setNbKm(int N) {
		this.nbKm=N;
	}
	
	public String getJour() {
		return jour;
	}
	public void setJour (String J) {
		this.jour=J;
	}
	
	public int getDuree() {
		return duree;
	}
	public void setDuree(int Du) {
		this.duree=Du;
	}
	
	public Saisie () {}
	
	public Saisie (int dept, int nbKm, String jour, int duree) {
		this.dept=dept;
		this.nbKm=nbKm;
		this.jour=jour;
		this.duree=duree;
	}
}
