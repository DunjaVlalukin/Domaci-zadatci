package domaciPon;

public class PlatnaKartica {
	//suma, broj kartice, mesec i godina
	private double stanje;
	private String brkartice;
	private int mesec;
	private int godina;
	
	public PlatnaKartica(int stanje, String brkartice, int mesec,int godina ) {
		super();
		this.stanje = stanje;
		this.brkartice = brkartice;
		this.mesec = mesec;
		this.godina = godina;
	}

	public double getStanje() {
		return stanje;
	}


	private int getGodina() {
		return godina;
	}

	public String getBrkartice() {
		return brkartice;
	}


	public int getMesec() {
		return mesec;
	}
	
//Metodu dodajSredstva koja ce dodavati sredstva za unetu vrednost
	//ovde ne mora da se vraca stanje
	public void dodajSredstva(double profit) {
		stanje += profit;
	}
	
	//Metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna
	//ovde ne mora da se vraca stanje
	public void izvrsiTransakciju (double trosak) {
		stanje = stanje - trosak;
	}
	
	//Metodu koja stampa podatke o kartici u formatu:
	//7105-1579-5191-6184, 11/2024, $212
	
	public void stampanjePodataka() {
		System.out.println(this.getBrkartice() + " " + this.getMesec() + "/" + this.getGodina() + "  $" + this.getStanje());
	}
	
	

}
