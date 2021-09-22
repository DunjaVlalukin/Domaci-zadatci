package domaciPon;

public class Master extends PlatnaKartica{
	//(int stanje, String brkartice, int mesec,int godina 

	public Master(int stanje, String brkartice, int mesec , int god) {
		super(stanje, brkartice, mesec, god);
	}
	
	//isti naziv za metodu kao i u platnoj kartici da bi funkcionisalo 
		 public void izvrsiTransakciju(double transakcija) {
			 double provizija = transakcija * 0.015;
			 super.izvrsiTransakciju(transakcija+provizija);
		 }
	
	//Implementirati metodu koja stampa karticu u formatu:
	//Master card: 7105-1579-5191-6184, 11/2024, $212

	public void odrzavanjeRacuna() {
		super.izvrsiTransakciju(2);
	}
		
		public void stampanjeMaster(){
			System.out.println(" Master card br: ");
			super.stampanjePodataka();
		 }

		
	}

