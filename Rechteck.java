
public class Rechteck {

	static final int BREITE = Array.BREITE;
	static final int HÖHE = Array.HÖHE;
	static char[][] array = Array.array;
	static final int MITTE_X = BREITE/2;
	static final int MITTE_Y = HÖHE/2;
	static final int BREITE_X = BREITE/2;
	static final int HÖHE_Y = HÖHE/2;
	
	public static void main(String[] args) {
		
		Array.init();
		
		rechteck(MITTE_X, MITTE_Y, BREITE_X, HÖHE_Y);
		
		Array.drucke();
	}

	public static void rechteck(final int MITTE_X, final int MITTE_Y, final int BREITE_X, final int HÖHE_Y)
	{
		_x:for (int i=MITTE_X;i<=MITTE_X+BREITE_X;i++)
		{
			if (i>=BREITE || i<0)
			{
				i++;
				continue _x;
			}
			
			_y:for (int j=MITTE_Y;j<=MITTE_Y+HÖHE_Y;j++)
			{
				if (i>=BREITE || i<0)
				{
					j++;
					continue _y;
				}

				if ((i==MITTE_X || i==MITTE_X+BREITE_X) || (j==MITTE_Y || j==MITTE_Y+HÖHE_Y)) 
				{
					array[i][j]='o';
				}
			}
		}
	}
}
