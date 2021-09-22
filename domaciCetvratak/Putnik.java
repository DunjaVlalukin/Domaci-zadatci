package domaciCetvratak;

public class Putnik extends Covek{
	//Putnik je covek koji poseduje novac. Inicijalno poseduje 
	//odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
	//Odredjena svota novca moze da mu se doda i/ili oduzme.
	
	private int novac;

	public Putnik(String imeIPrezime, int novac) {
		super(imeIPrezime);
		this.novac = novac;
	}
	
	public int DodajNovac(int dopuna) {
		novac+= dopuna;
		return novac;
	}
	
	
	public int naplatiKartu(int racun) {
		novac-=racun;
		return novac;
	}
	

	public int getNovac() {
		return novac;
	}

	public void setNovac(int novac) {
		this.novac = novac;
	}

	@Override
	public String toString() {
		return super.toString() + " ima BusPlus sa: " + novac + " din.";
	}
	
	

}
