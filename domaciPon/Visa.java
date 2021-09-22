package domaciPon;

public class Visa extends PlatnaKartica{
	 private String imeiPrezime;
	 //Implementirati metodu tako da na prosledjenu transakciju dodeljuje se provizija od 1.8%
	 //Najmanja provizija je 4$

	
	public Visa(int stanje, String brkartice, int mesec,int godina , String imeiPrezime) {
		super(stanje, brkartice, mesec, godina);
		this.imeiPrezime = imeiPrezime;
	}

	public String getImeiPrezime() {
		return imeiPrezime;
	}

	public void setImeiPrezime(String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
	}
	 
	//isti naziv za metodu kao i u platnoj kartici da bi funkcionisalo 
	 public void izvrsiTransakciju(double transakcija) {
		 double provizija = transakcija * 0.018;
		 if(provizija<4) {
			 super.izvrsiTransakciju(transakcija+4);
		 }else {
		 super.izvrsiTransakciju(transakcija+provizija);
	 }
	 }
	 
	 
	 //Implementirati metodu koja stampa karticu u formatu:
		// Visa card: 7105-1579-5191-6184, 11/2024, $212
	 public void stampanjeVisa() {
		 System.out.print("Visa card: ");
		 super.stampanjePodataka();
		 System.out.println(" " + this.getImeiPrezime());
	 }

}
