package domaciCetvratak;

public class Vozac extends Covek{
	//vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
	private String zanimanje;

	public Vozac(String imeIPrezime, String zanimanje) {
		super(imeIPrezime);
		this.zanimanje = zanimanje;
	}
	

	public String getZanimanje() {
		return zanimanje;
	}


	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
	}


	@Override
	public String toString() {
		return super.toString() + " " + zanimanje ;
	}
	

}
