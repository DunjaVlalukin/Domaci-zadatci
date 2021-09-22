package videoplayer;

public class TimeControl extends Control {
	private boolean unapred;

	public TimeControl(boolean unapred) {
		super();
		this.unapred = unapred;
	}

	public boolean isUnapred() {
		return unapred;
	}

	public void setUnapred(boolean unapred) {
		this.unapred = unapred;
	}

	public void izvrsiAkciju(VideoPlayer player) {
		if (unapred = true) {
			if (player.getTrenutnoVremeVidea() < player.getDuzinaVidea() - 15) {
				player.setTrenutnoVreme(player.getTrenutnoVremeVidea() + 15);	//setujemo novo vreme gde ga pomera
			} else {
				player.setDuzinaVidea(player.getDuzinaVidea()); //ako ne moze -15 stavlja ga  na kraj videa
			}
		} else {		//unazad
			if (player.getTrenutnoVremeVidea() > 15) {
				player.setDuzinaVidea(player.getDuzinaVidea() - 15);
			} else {
				player.setDuzinaVidea(0);  //ako ne moze da oduzme 15sec onda ga baca na 0
			}
		}
	}

}
