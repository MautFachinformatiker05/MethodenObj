
public class Rechteck {

	static final int BREITE = Array.BREITE;
	static final int H�HE = Array.H�HE;
	static char[][] array = Array.array;
	static final int MITTE_X = BREITE/2;
	static final int MITTE_Y = H�HE/2;
	static final int BREITE_X = BREITE/2;
	static final int H�HE_Y = H�HE/2;
	
	public static void main(String[] args) {
		
		Array.init();
		
		rechteck(MITTE_X, MITTE_Y, BREITE_X, H�HE_Y);
		
		Array.drucke();
	}

	public static void rechteck(final int MITTE_X, final int MITTE_Y, final int BREITE_X, final int H�HE_Y)
	{
		_x:for (int i=MITTE_X;i<=MITTE_X+BREITE_X;i++)
		{
			if (i>=BREITE || i<0)
			{
				i++;
				continue _x;
			}
			
			_y:for (int j=MITTE_Y;j<=MITTE_Y+H�HE_Y;j++)
			{
				if (i>=BREITE || i<0)
				{
					j++;
					continue _y;
				}

				if ((i==MITTE_X || i==MITTE_X+BREITE_X) || (j==MITTE_Y || j==MITTE_Y+H�HE_Y)) 
				{
					array[i][j]='o';
				}
			}
		}
	}
}
