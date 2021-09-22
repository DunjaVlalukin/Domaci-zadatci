package zooloskiVrt;

public class Zivotinje {
	private String vrsta;
	private String name;
	private String hrana;
	
	public Zivotinje(String vrsta, String name, String hrana) {
		this.vrsta = vrsta;
		this.name = name;
		this.hrana = hrana;
	}

	public String getVrsta() {
		return vrsta;
	}


	public String getName() {
		return name;
	}


	public String getHrana() {
		return hrana;
	}

	
	
	@Override
	public String toString() {
		return "Zivotinja " + vrsta + ", " + name + ", hrani se=" + hrana ;
	}

	
}
