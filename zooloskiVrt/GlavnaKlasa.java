package zooloskiVrt;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
		Ribe r1 = new Ribe("kicmenjak", "Saran" , "granule" , "Bazen", 4 , "kratka");
		Ribe r2 = new Ribe("kicmenjak", "Skusa" , "racici" , "morski bazen", 8 , "racvasto");
		Sisari s1 = new Sisari("kicmenjak", "divlje prase" , "granule" , "braon" , "biljojed" );
		s1.setDivljePitome("divlja");
		
		s1.stampanje();
		
		//Jednom sisaru zameniti ulogu koju mu je covek dodelio.
		s1.setDivljePitome("pitoma");
		
		r1.stampanje();
		s1.stampanje();
		
		//Ispisati bar jedno staniste.
		Staniste voda = new Staniste("Voda");
		voda.dodavanjeZivotinja(r1);
		voda.dodavanjeZivotinja(s1);
		voda.dodavanjeZivotinja(r2);
		
		voda.stampanje();
		
		voda.uklonizivotinju(r1);
		voda.stampanje();

		
				
	
		

	}

}
