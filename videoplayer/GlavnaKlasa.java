package videoplayer;

import java.util.ArrayList;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// int duzinaVidea, int trenutnoVreme, int jacinaZvuka, int kvalitetVidea)
		
		VideoPlayer p1 = new VideoPlayer(300, 01, 30, 240);
		VideoPlayer p2 = new VideoPlayer(600, 557, 100, 144);
		
		p1.stampaj();
		p2.stampaj();
		
		QualityOptimizerControl q1 = new QualityOptimizerControl(505);
		TimeControl t1 = new TimeControl(true);
		AudioControl a1 = new AudioControl(false);
		
		p1.stampaj();
		System.out.println("");
		
		q1.izvrsiAkciju(p1);
		t1.izvrsiAkciju(p1);
		a1.izvrsiAkciju(p1);
		t1.izvrsiAkciju(p1);
		p1.stampaj();
		
		System.out.println("------------");
		
		ArrayList<Control> akcije = new ArrayList();
		akcije.add(q1);
		akcije.add(t1);
		akcije.add(a1);
		
		for (int i = 0; i < akcije.size(); i++) {
			akcije.get(i).izvrsiAkciju(p2);
		}
		p2.stampaj();

	}

}
