
public class Punkte_5 {
	
	static final int BREITE = 49;
	static final int H�HE = 49;
	static char[][] array = new char[BREITE][H�HE];

	public static void main(String[] args) {
												// Gr��e: 49x49, 0,0 ist oben links
		Array.init();
		
		array[0][0] = 'o';
		array[BREITE-1][0] = 'o';
		array[0][H�HE-1] = 'o';
		array[BREITE-1][H�HE-1] = 'o';
		array[BREITE/2][H�HE/2] = 'o';
		
		Array.drucke();

	}

}