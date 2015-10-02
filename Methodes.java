package Taxi;

import java.util.Scanner;
import java.util.List;

public class Methodes {
	
	public static Scanner saisie = new Scanner(System.in);
	
	public static String saisieJour () {
		System.out.println("-Le jour de la semaine :");
		return (saisie.next());
	}
	
	public static int saisieKm () {
		System.out.println("-Le nombre de kilomètre(s) :");
		return (saisie.nextInt());
	}
	
	public static int saisieMinutes () {
		System.out.println("-La durée du trajet (en minutes) :");
		return (saisie.nextInt());
	}
	
	public static int saisieDept () {
		System.out.println("-Le département :");
		return (saisie.nextInt());
	}
	
	public static void calcul (Saisie saisie2, List <Tarifs> liste) {
		
		double prix=0;
		int indice=0;
		
		
			while (saisie2.getDept() != liste.get(indice).getDepartement() && indice < liste.size() )
			{
				indice ++;
			}	
				if (indice >= liste.size()) 
				{
					System.out.println("Le departement n'a pas été trouvé");
				}
			
				else {
					//System.out.println("Le departement :"+liste.get(indice).getPriseEnCharge()+" - "+liste.get(indice).getTarifHoraireDimanche());
					if ((int)(saisie2.getDuree()/60) >=1 && saisie2.getJour().equals("Dimanche")) 
					{
					prix = liste.get(indice).getPriseEnCharge() + ((int)(saisie2.getDuree()/60) * liste.get(indice).getTarifHoraireDimanche()) + (saisie2.getNbKm() * liste.get(indice).getTarifKmDimanche());
					}
				
					if ((int)(saisie2.getDuree()/60) >= 1 && !saisie2.getJour().equals("Dimanche"))
					{
					prix = liste.get(indice).getPriseEnCharge() + ((int)(saisie2.getDuree()/60) * liste.get(indice).getTarifHoraireSemaine()) + saisie2.getNbKm() * liste.get(indice).getTarifKmSemaine();
					}
				
					if ( (int)(saisie2.getDuree()/60) < 1  && saisie2.getJour().equals("Dimanche"))
					{
					prix = liste.get(indice).getPriseEnCharge() + (saisie2.getNbKm() * liste.get(indice).getTarifKmDimanche());
					}
				
					if ((int)(saisie2.getDuree()/60) < 1 && !/*jour*/saisie2.getJour().equals("Dimanche"))
					{
						prix = liste.get(indice).getPriseEnCharge() + (saisie2.getNbKm() * liste.get(indice).getTarifKmSemaine());
					}
				}
		
		
		System.out.println("Votre prix pour le deplacement est de : "+prix+"€.");
		
	}

}
