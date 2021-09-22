package videoplayer;

public class QualityOptimizerControl extends Control {
	private int brzinaInterneta;
	private int[] kvalitet = { 144, 240, 720 };

	public QualityOptimizerControl(int brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}

	public int getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(int brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	// Kvalitet se racuna na osnovu formule: brzina interneta * 10.1 gde se uzima prvi veci kvalitet
	 //ako je brzina 20 * 10.1 = 204 - postavlja 240;
	// ako je brzina 5*10.1 = 50.5 - postavlja 144;
	 //ako je brzina 20*10.1 = 505 - postavlja 720;
	
	
	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		double min = 10000000;
		int index = 0;
		for (int i = 0; i < kvalitet.length; i++) {
			double vrednost = (this.brzinaInterneta * 10.1) - this.kvalitet[i];
			if (Math.abs(vrednost) < min) {
				min = vrednost;
				index = i;
			}
		}
		player.setKvalitetVidea(this.kvalitet[index]);

	}

}
