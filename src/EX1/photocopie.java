package EX1;

public class photocopie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tarif10Premieres=0.1;
		double tarif20Suivantes=0.08;
		double tarifSuivantes=0.07;

		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("nb photocopie");
		int nbCopie = sc.nextInt();
		
		double prixTotal=0;
		if (nbCopie<=10) {
			prixTotal=nbCopie*tarif10Premieres;
		}else {
			prixTotal=10*tarif10Premieres;
					nbCopie=nbCopie-10;
			if (nbCopie<=20) {
				prixTotal=prixTotal+20*tarif20Suivantes;
		}else {
				prixTotal=prixTotal+20*tarif20Suivantes;
					nbCopie=nbCopie-20;
				if(nbCopie>=0) {
					prixTotal=prixTotal+nbCopie*tarifSuivantes;
						}
			}
		}
		System.out.println("merci de payer "+prixTotal+"euros");	
			}

	}
