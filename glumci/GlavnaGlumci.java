package glumci;

import java.util.ArrayList;

public class GlavnaGlumci {

	public static void main(String[] args) {

		Glumci glumac1 = new Glumci("Ljubomir Bandovic", 1976, 'm', "ozenjen", 5000000, 30);
		glumac1.stampanje();

		// array poslednjih 5 snimljenih filmova,pored naslova napisati ocenu sa imdb-a

		ArrayList<Object> najnovijiFilmovi = new ArrayList();

		najnovijiFilmovi.add("Jedini izlaz 7.4/10");
		najnovijiFilmovi.add("The name of the people 7.6/10");
		najnovijiFilmovi.add("Hotel Belgrade 6.3/10");
		najnovijiFilmovi.add("Father 7.6/10");
		najnovijiFilmovi.add("The Team 4.4/10");

		Object tmp = najnovijiFilmovi.get(1);
		najnovijiFilmovi.set(1, najnovijiFilmovi.get(3));
		najnovijiFilmovi.set(3, najnovijiFilmovi.get(2));
		najnovijiFilmovi.set(2, najnovijiFilmovi.get(0));
		najnovijiFilmovi.set(0, tmp);

		System.out.println("Poslednjih 5 snimljenih filmova rangiranih po oceni IMDb-a: ");
		for (int i = 0; i < najnovijiFilmovi.size(); i++) {
			System.out.println((i + 1) + " " + najnovijiFilmovi.get(i));
		}

		System.out.println("----------------------");

		Glumci glumac2 = new Glumci("Vesna Trivalic", 1965, 'z', "neudata", 5000000, 65);
		glumac2.stampanje();
		
		ArrayList<Object> najnovijiFilmovi2 = new ArrayList();

		najnovijiFilmovi2.add("Savovi 7.1/10");
		najnovijiFilmovi2.add("Stado 7.0/10");
		najnovijiFilmovi2.add("Jesen Samuraja 6.3/10");
		najnovijiFilmovi2.add("Cefurji raus! 6.6/10");
		najnovijiFilmovi2.add("Puls 9.1/10");

		Object tmp2 = najnovijiFilmovi2.get(0);
		najnovijiFilmovi2.set(0, najnovijiFilmovi2.get(4));
		najnovijiFilmovi2.set(4, najnovijiFilmovi2.get(2));
		najnovijiFilmovi2.set(2, najnovijiFilmovi2.get(1));
		najnovijiFilmovi2.set(1, tmp2);
		
		System.out.println("Poslednjih 5 snimljenih filmova rangiranih po oceni IMDb-a: ");
		for (int i = 0; i < najnovijiFilmovi2.size(); i++) {
			System.out.println((i + 1) + " " + najnovijiFilmovi2.get(i));
		}

	}

}
