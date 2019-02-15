
public class KreisGefüllt {

	static final int BREITE = Array.BREITE;
	static final int HÖHE = Array.HÖHE;
	static final int RADIUS =10;
	static final int MITTE_X = BREITE/2;
	static final int MITTE_Y = HÖHE/2;
	static char[][] array = Array.array;
	
	public static void main(String[] args) {

		Array.init();
		
		kreisgef(MITTE_X,MITTE_Y,RADIUS);
		
		Array.drucke();
	}

	public static void kreisgef(final int MITTE_X,final int MITTE_Y, final int RADIUS) {
		for (int i = 0; i < BREITE; i++) {	
			for (int j = 0; j < HÖHE; j++) {
				int a_x = i-MITTE_X;			// Abstand von Mittelpunkt von X
				int a_y = j-MITTE_Y;			// Abstand von Mittelpunkt von Y
				if (a_x*a_x+a_y*a_y>=(RADIUS*RADIUS)-RADIUS  && a_x*a_x+a_y*a_y<=(RADIUS*RADIUS)+RADIUS || a_x*a_x+a_y*a_y<=(RADIUS*RADIUS))
				{
					array[i][j]='o';
				}
				
			}
		}
	}
	
	public static void kreisdel(final int MITTE_X,final int MITTE_Y, final int RADIUS) {
		for (int i = 0; i < BREITE; i++) {	
			for (int j = 0; j < HÖHE; j++) {
				int a_x = i-MITTE_X;			// Abstand von Mittelpunkt von X
				int a_y = j-MITTE_Y;			// Abstand von Mittelpunkt von Y
				if (a_x*a_x+a_y*a_y>=(RADIUS*RADIUS)-RADIUS  && a_x*a_x+a_y*a_y<=(RADIUS*RADIUS)+RADIUS || a_x*a_x+a_y*a_y<=(RADIUS*RADIUS))
				{
					array[i][j]=' ';
				}
				
			}
		}
	}

}
