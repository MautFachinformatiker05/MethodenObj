
public class Array {

	static final int BREITE = 49;
	static final int HÖHE = 49;
	static char[][] array = new char[BREITE][HÖHE];

	public static void main(String[] args) {

		init();

		drucke();
		// Größe: 49x49, 0,0 ist oben links
	}
	
	//Druckt das Array aus
	public static void drucke() {
		for (int i = 0; i < BREITE; i++) {	// druckt aus
			for (int j = 0; j < HÖHE; j++) {
				System.out.print(array[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void druckeerr() {
		for (int i = 0; i < BREITE; i++) {	// druckt aus
			for (int j = 0; j < HÖHE; j++) {
				System.err.print(array[i][j]);
				System.err.print(" ");
			}
			System.err.println();
		}
	}
	
	//Initialisiert das Array mit ' '
	public static void init() {
		for (int i = 0; i < BREITE; i++) {	// setzt alles auf ' '
			for (int j = 0; j < HÖHE; j++) {
				array[i][j] = ' ';
			}
		}
	}

}
