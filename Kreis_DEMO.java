
public class Kreis_DEMO {
	
	static final int BREITE = Array.BREITE;
	static final int HÖHE = Array.HÖHE;
	static char[][] array = Array.array;

	public static void main(String[] args) {

		Array.init();
		
		RechteckGefüllt.rechteckGef(20, 18, 6, 12);
		
		KreisGefüllt.kreisgef(23, 13, 6);
		Kreis.kreis(23, 13, 9);
		Kreis.kreis(23, 13, 12);
		Kreis.kreis(23, 13, 15);
		Kreis.kreis(23, 13, 18);
		Kreis.kreis(23, 13, 21);
		Kreis.kreis(23, 13, 24);
		
		KreisGefüllt.kreisgef(23, 33, 6);
		Kreis.kreis(23, 33, 9);
		Kreis.kreis(23, 33, 12);
		Kreis.kreis(23, 33, 15);
		Kreis.kreis(23, 33, 18);
		Kreis.kreis(23, 33, 21);
		Kreis.kreis(23, 33, 24);
		
		KreisGefüllt.kreisdel(23, 13, 4);
		KreisGefüllt.kreisdel(23, 33, 4);
		
		
		
		
		
		Array.drucke();

	}

}
