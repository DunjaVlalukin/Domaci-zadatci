package glumci;

public class Glumci {
	/*
	 * Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina
	 * rodjenja, pol. Private atributi su: da li su ozenjeni ili udati (boolean),
	 * prosecna zarada po filmu, broj snimljenih filmova. Potrebno je izracunati i
	 * odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko
	 * godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena
	 * da se doda "Mr." ili "Mrs." ako su zenskog pola. Nakon toga napraviti Array
	 * listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova
	 * napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore
	 * ocenjenog filma od tih pet (preko getera i setera).
	 * 
	 */

	public String imeIPrezime;
	public int godRodjenja;
	public char pol;
	private String bracniStatus;
	private long prosekZarade;
	private int brFilmova;

	public Glumci(String ime, int gRodj, char pol, String bracniStatus, long prosekZarade, int brFilm) {
		this.imeIPrezime = ime;
		this.godRodjenja = gRodj;
		this.pol = pol;
		this.bracniStatus = bracniStatus;
		this.prosekZarade = prosekZarade;
		this.brFilmova = brFilm;

	}

	// bracni status
	public boolean bracniStatus() {
		if (bracniStatus.equalsIgnoreCase("ozenjen") || bracniStatus.equalsIgnoreCase("udata")) {
			return true;
		} else {
			return false;
		}

	}

	// ukupna zarada
	public long ukupnaZarada() {
		return (this.prosekZarade * this.brFilmova);
	}

	// br godina 2022.g
	public int brGod() {
		return (2022 - this.godRodjenja);
	}

	// mr or ms
	public String mrOrMrsName() {
		if (this.pol == 'm') {
			String mr = "Mr.";
			mr = mr.concat(imeIPrezime);
			return (mr);
		} else {
			String ms = "Mrs.";
			ms = ms.concat(imeIPrezime);
			return (ms);
		}
	}

	// izracunati i odstampati sve att
	public void stampanje() {
		if (this.pol == 'm') {
			System.out.println(this.mrOrMrsName() + " Rodjen: " + this.godRodjenja + ".godine. \n Ozenjen: "
					+ this.bracniStatus() + "\n Prosecna zarada po filmu je: $" + this.prosekZarade + " i snimio je: "
					+ this.brFilmova + " filmova." + "\n Ukupno je zaradio: $" + this.ukupnaZarada()
					+ " \n 2022.godine puni " + this.brGod() + " god.");
		} else if (this.pol == 'z') {
			System.out.println(this.mrOrMrsName() + " Rodjena: " + this.godRodjenja + ".godine. \n Udata: "
					+ this.bracniStatus() + "\n Prosecna zarada po filmu je: $" + this.prosekZarade + " i snimila je: "
					+ this.brFilmova + " filmova." + "\n Ukupno je zaradila: $" + this.ukupnaZarada()
					+ "\n 2022.godine puni " + this.brGod() + " god.");
		}
	}

}
