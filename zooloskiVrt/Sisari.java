package zooloskiVrt;

public class Sisari extends Zivotinje{
	private String bojaDlake;
	private String nacinIshrane;
	private String divljePitome;
	
	public Sisari(String vrsta, String name, String nacinIshrane, String bojaDlake, String nacinIshrane2) {
		super(vrsta, name, nacinIshrane);
		this.bojaDlake = bojaDlake;
		this.nacinIshrane = nacinIshrane2;
	}
	public String getBojaDlake() {
		return bojaDlake;
	}
	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getNacinIshrane() {
		return nacinIshrane;
	}
	
	public void setDivljePitome(String divljePitome) {
		this.divljePitome = divljePitome;
	}
	
	public void stampanje() {
		System.out.println(super.getName() + " iz kategorije: " + super.getVrsta() + " ,hrani se: " + super.getHrana() + 
				" i spada u: " + this.nacinIshrane + " , ima: " + this.bojaDlake + " boju dlake. " );
		if(this.divljePitome.equalsIgnoreCase("divlja")) {
			System.out.println("Divlja je zivotinja.");
		}else {
			System.out.println("Pitoma je zivotinja.");
		}
	}

}
