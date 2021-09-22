package videoplayer;

public class AudioControl extends Control {
	private boolean menjanjeZvuka;

	public AudioControl(boolean menjanjeZvuka) {
		super();
		this.menjanjeZvuka = menjanjeZvuka;
	}

	public boolean isMenjanjeZvuka() {
		return menjanjeZvuka;
	}

	public void setMenjanjeZvuka(boolean menjanjeZvuka) {
		this.menjanjeZvuka = menjanjeZvuka;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer player) {
		if (!this.menjanjeZvuka) {
			if (player.getJacinaZvuka() > 0) {
				player.setJacinaZvuka(player.getJacinaZvuka() - 1);
			} else {
				System.out.println("Zvuk je iskljucen");
			}
		} else {
			if (player.getJacinaZvuka() < 100) {
				player.setJacinaZvuka(player.getJacinaZvuka() + 1);
			} else {
				System.out.println("Zvuk je maksimalno pojacan.");
			}
		}
	}

}
