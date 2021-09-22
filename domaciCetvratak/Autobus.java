package domaciCetvratak;



public class Autobus {
	//Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. 
	//Naziv i cena karte i zadaju se prilikom kreiranja.
	//Moguce je dodati/ukloniti putnika kao i vozaca.
	private String nazivBusa;
	private int cenaKarte;
	private Putnik p;
	private Vozac vozac;
	
	public Autobus(String nazivBusa, Vozac vozac ,int cenaKarte,Putnik p) {
		this.nazivBusa = nazivBusa;
		this.cenaKarte = cenaKarte;
		this.p = p;
		this.vozac = vozac;
		
	}
	//dodavanje/uklanjanje putnika i vozaca
	public Putnik getPutnik() {
		 return p;
	}
	
	
	public void setUkloniPutnik(Putnik p) {
		 this.p= null;
	}
	public Putnik getUkloniPutnik() {
		return this.p;
	}
	
	//public Vozac dodajVozaca(String imeIPrezime,String zanimanje) {
		// Vozac vozac = new Vozac(imeIPrezime, zanimanje);
	//	 return vozac;
	//}
	
	public Vozac getVozac() {
		 return vozac;
	}

	public void setUkloniVozaca(Vozac v) {
		 this.vozac= null;
	}
	public Vozac getUkloniVozaca() {
		return this.vozac;
	}
	
	
	@Override
	public String toString() {
		return "Autobus: " + nazivBusa + ", vozac: " + vozac + " cena jedne karte: "  + cenaKarte +", ima putnika: " + p ;
	}
	
	

}
