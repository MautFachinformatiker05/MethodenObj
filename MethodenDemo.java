
public class MethodenDemo {
	
	static int anzahl=8;
	static String [] nameA =new String[anzahl];
	// alternative Direkt Initialiserung
	//static String [] nameA = {"Michael","Louisa","Tabea","Bendedikt","Filip","Denis","Susanne","Manuel"};
	static String [] nameB = {"Susi","Sonja","Sabrina"}; //Indexvariablen 0,1,2
	public static void main(String[] args) {
		
		nameA [0] ="Michael";
		
		nameA [1]= "Louisa";
		nameA [2]= "Tabea";
		nameA [3]= "Benedikt";
		nameA [4]= "Filip";
		nameA [5]= "Denis";
		nameA [6]= "Susanne";
		nameA [7]= "Manuel";
		
	
		druckenMitArray(nameA);
		
		nameB= new String[]{"Peter","Franz","Hans"};
		
		druckenMitArray(nameB);
		
		// Hans kommt nicht mehr, aber Markus
		nameB[2]="Markus";
		druckenMitArray(nameB);
		}
	
	public static void druckenMitArray(String[] einArray)
	{
		for (int i = 0 ; i<einArray.length;i++)
			System.out.println(einArray[i]);
	}
	
	public static void druckenMitArray2()
	{
		// alle Elemente drucken
		for (int i = 0 ; i<anzahl;i++)
			System.out.println(nameA[i]);
		
		for (int i = 0 ; i<nameA.length;i++)
			System.out.println(nameA[i]);
		
		for (String s : nameA)
			System.out.println(s);
			
	}
	

}
