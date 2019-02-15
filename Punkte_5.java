
public class Punkte_5 {
	
	static final int BREITE = 49;
	static final int HÖHE = 49;
	static char[][] array = new char[BREITE][HÖHE];

	public static void main(String[] args) {
												// Größe: 49x49, 0,0 ist oben links
		Array.init();
		
		array[0][0] = 'o';
		array[BREITE-1][0] = 'o';
		array[0][HÖHE-1] = 'o';
		array[BREITE-1][HÖHE-1] = 'o';
		array[BREITE/2][HÖHE/2] = 'o';
		
		Array.drucke();

	}

}