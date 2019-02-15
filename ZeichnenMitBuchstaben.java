
public class ZeichnenMitBuchstaben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] tabelle = new char[49][49];

		tabelle[0][0] = '1';
		tabelle[0][48] = '2';
		tabelle[48][0] = '3';
		tabelle[48][48] = '4';
		tabelle[24][24] = '5';
		
		for (int i = 0; i < 49; i++) {
			for (int j = 0; j < 49; j++) {
				tabelle[i][j]='.';
			}
		}

		tabelle[0][0] = '1';
		tabelle[0][48] = '2';
		tabelle[48][0] = '3';
		tabelle[48][48] = '4';
		tabelle[24][24] = '5';
		// schreibeHorizontLinie(tabelle, 0, 1, 47);
		// schreibeVertLinie(tabelle,0,0,47);
		//rechteck(tabelle, 5, 5, 12, 12);
//		kreis(tabelle,24,24,10);
//		kreisfull(tabelle, 36,24,10);
		halbkreis(tabelle,24,24,15);
		zeichne(tabelle);
		

	}

	public static void kreis(char [][]feld,int mittelZeile,int mittelSpalte,int radius)
	{
		double abstand=0;
		for (int i = 0; i < 49; i++) {
			for (int j = 0; j < 49; j++) {
				abstand=Math.sqrt(Math.pow(mittelZeile-j,2)+Math.pow(mittelSpalte-i, 2));
				if (Math.abs(abstand- radius)<=0.5){
				feld[i][j]='O';
				}
			}
			}
	}
	
	public static void halbkreis(char [][]feld,int mittelZeile,int mittelSpalte,int radius)
	{
		double abstand=0;
		for (int i = 0; i < 49; i++) {
			for (int j = 0; j < 49; j++) {
				abstand=Math.sqrt(Math.pow(mittelZeile-j,2)+Math.pow(mittelSpalte-i, 2));
				if ((Math.abs(abstand- radius)<=0.49) && (i >=mittelZeile )){
				feld[i][j]='O';
				}
			}
			}
	}
	
	public static void kreisfull(char [][]feld,int mittelZeile,int mittelSpalte,int radius)
	{
		double abstand=0;
		for (int i = 0; i < 49; i++) {
			for (int j = 0; j < 49; j++) {
				abstand=Math.sqrt(Math.pow(mittelZeile-j,2)+Math.pow(mittelSpalte-i, 2));
				if (abstand<=radius){
				feld[i][j]='O';
				}
			}
			}
	}
	public static void schreibeHorizontLinie(char[][] feld, int startzeile, int startspalte, int zielspalte) {

		for (int j = startspalte; j <= zielspalte; j++) {
			feld[startzeile][j] = 'O';
		}
		// zeichne(feld);

	}

	public static void schreibeVertLinie(char[][] feld1, int startzeile, int startspalte, int zielzeile) {

		for (int j = startzeile; j <= zielzeile; j++) {
			feld1[j][startspalte] = 'O';
		}

	}

	public static void zeichne(char[][] feld3) {
		for (int i = 0; i < 49; i++) {
			for (int j = 0; j < 49; j++) {
				System.out.print(feld3[i][j]);
			}
			System.out.println();
		}
	}

	public static void rechteck(char[][] feld, int startzeile, int startspalte, int zielzeile, int zielspalte) {
		schreibeVertLinie(feld, startzeile, startspalte, zielzeile);

		schreibeVertLinie(feld, startzeile, zielspalte, zielzeile);
		schreibeHorizontLinie(feld, startzeile, startspalte, zielspalte);
		schreibeHorizontLinie(feld, zielzeile, startspalte, zielspalte);

	}

}
