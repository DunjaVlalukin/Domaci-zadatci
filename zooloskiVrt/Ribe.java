package zooloskiVrt;

public class Ribe extends Zivotinje{
	private String mestoObitavanja;
	private int brPeraja;
	private String vrstaperaja;
	
	public Ribe(String vrsta, String name, String nacinIshrane, String mestoObitavanja, int brPeraja,
			String vrstaperaja) {
		super(vrsta, name, nacinIshrane);
		this.mestoObitavanja = mestoObitavanja;
		this.brPeraja = brPeraja;
		this.vrstaperaja = vrstaperaja;
	}
	
	
	
	public String getMestoObitavanja() {
		return mestoObitavanja;
	}


	public int getBrPeraja() {
		return brPeraja;
	}

	public String getVrstaperaja() {
		return vrstaperaja;
	}


	public void stampanje() {
		System.out.println(super.getName() + " iz kategorije: " + super.getVrsta() + " hrani se: " + super.getHrana() + 
				". Obitava u: " + this.mestoObitavanja + " , ima: " + this.brPeraja + " peraja vrste: " + this.vrstaperaja);
	}

}
