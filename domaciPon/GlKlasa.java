package domaciPon;

public class GlKlasa {

	public static void main(String[] args) {
		//int stanje, String brkartice, int mesec,int godina , String imeiPrezime)

		Visa v1 = new Visa( 500000 ," 889-988-888" , 10 ,22, "Dunja Vlalukin" );
		v1.stampanjeVisa();
		
		v1.dodajSredstva(1000);
		v1.stampanjeVisa();
		v1.izvrsiTransakciju(50000);
		v1.stampanjeVisa();
		
		Master m1 = new Master(200000, "777-666-555", 11, 22);
		m1.stampanjeMaster();
		m1.dodajSredstva(2000);
		m1.stampanjeMaster();
		m1.odrzavanjeRacuna();
		m1.stampanjeMaster();

	}

}
