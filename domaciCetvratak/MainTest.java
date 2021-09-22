package domaciCetvratak;

public class MainTest {

	public static void main(String[] args) {
		//
		
		Vozac v1 = new Vozac("Marko Petrovic", "sofer");
		System.out.println(v1);
		Vozac v2 = new Vozac("Marko Markovic", "kondukter");
		System.out.println(v2);
		
		Putnik p1 = new Putnik ("Dunja Vlalukin", 1000);
		p1.DodajNovac(500);
		p1.naplatiKartu(140);
		System.out.println(p1);
		
		//String nazivBusa, Vozac vozac ,int cenaKarte,Putnik p)
		Autobus a1 = new Autobus("95", v1, 200 , p1);
		
		System.out.println(a1);
		a1.setUkloniVozaca(v1);
		a1.setUkloniPutnik(p1);
		System.out.println(a1);
		
		Autobus2 a2 = new Autobus2("96",180);
		a2.dodajPutnika("Marko Ilic", 2000);
		a2.putniciStampa();
	}

}
