package videoplayer;

public class VideoPlayer {
	private int duzinaVidea;
	private int trenutnoVremeVidea;
	private int jacinaZvuka;
	private int kvalitetVidea; //(144, 240, 360, 480, 720, 1080)

	public VideoPlayer(int duzinaVidea, int trenutnoVreme, int jacinaZvuka, int kvalitetVidea) {
		super();
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVremeVidea = trenutnoVremeVidea;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}

	public int getDuzinaVidea() {
		return duzinaVidea;
	}

	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}

	public int getTrenutnoVremeVidea() {
		return trenutnoVremeVidea;
	}

	public void setTrenutnoVreme(int trenutnoVreme) {
		this.trenutnoVremeVidea = trenutnoVremeVidea;
	}

	public int getJacinaZvuka() {
		return jacinaZvuka;
	}

	public int getKvalitetVidea() {
		return kvalitetVidea;
	}

	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}

	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}

	public void stampaj() {
		System.out.println("Trenutno vreme videa:  " + this.trenutnoVremeVidea + " sec.\n Jacina zvuka: "
				+ this.jacinaZvuka + "\n  A kvalitet videa je: " + this.kvalitetVidea + "p.");

	}

}
