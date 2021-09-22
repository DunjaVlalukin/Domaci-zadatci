package domaciCetvratak;

import java.util.ArrayList;

public class Autobus2 {
	//Autobus poseduje naziv, vozaca, cenu karte i  listu putnika koji se njime voze. 
	//Naziv i cena karte i zadaju se prilikom kreiranja.
	//Moguce je dodati/ukloniti putnika kao i vozaca.Moguce je naplatiti kartu putnicima samo ako je vozac prisutan
	private String nazivBusa;
	private int cenaKarte;
	private ArrayList<Putnik> listaPutnika;
	private Vozac vozac;
	private boolean naplataKarte;
	
	public Autobus2(String nazivBusa, int cenaKarte, Vozac vozac) {
		this.nazivBusa = nazivBusa;
		this.cenaKarte = cenaKarte;
		this.vozac= vozac;
		this.listaPutnika = new ArrayList<Putnik>();
		
	}
	public Putnik dodajPutnika(String imeIPrezime, int novac) {
		Putnik nekiPutnik = new Putnik( imeIPrezime, novac);
		listaPutnika.add(nekiPutnik);
		return nekiPutnik;
		
	}
	
	public void ukloniPutnika(String imeIPrezime) {
		for(int i = 0; i<listaPutnika.size(); i++) {
			if(this.listaPutnika.get(i).equals(imeIPrezime)) {
				this.listaPutnika.remove(i);
			}
	}
	}
	
	
	public ArrayList<Putnik> getListaPutnika(){
		return listaPutnika;
	}
	
	
	//public Vozac dodajVozaca(String imeIPrezime,String zanimanje) {
		// Vozac vozac = new Vozac(imeIPrezime, zanimanje);
	//	 return vozac;
	//}
	
	public void setVozaca (Vozac v) {
			this.vozac= v;
		}

	public Vozac getVozaca() {
		 return vozac;
	}
	
	
	public int naplataKarte(int brojKarata) {
	       int placanje;
	        if (prisutanVozac()) {
	            placanje =cenaKarte* brojKarata;
	        return  placanje;
	}else {
		placanje=0;
		return placanje;}
	}
	
	
	public boolean prisutanVozac() {
		if(this.vozac == null) {
			return false;
		}else {
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "Autobus: " + nazivBusa + ", vozac: " + vozac + " cena jedne karte: "  + cenaKarte  ;
	}
	//stampa liste
	public void putniciStampa() {
		System.out.println("Putnici: " );
		for(int i = 0; i<listaPutnika.size(); i++) {
			System.out.println( this.getListaPutnika());
		}
	}

}
