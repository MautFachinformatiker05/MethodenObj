class Benutzer {
	String vorname;
	String nachname;
	
static String firma;    //static-Variablen gelten für alle Objekte der Klasse Benutzer; 
		        	//aufrufbar, auch wenn noch keine Objekte angelegt wurden = Klassenvariable
	
	
	
	
	
	
	public static void main (String[] args){
		firma = "IBM";	//alle Benutzer sind Angestellte der Firma IBM   
		
		
		Benutzer nutzer1 = new Benutzer ();
		nutzer1.vorname = "Oliver";
		nutzer1.nachname = "Oppitz";
		nutzer1.druckeBenutzer();
		Benutzer nutzer2 = new Benutzer ();
		nutzer2.vorname ="Hans";
		nutzer2.nachname="Richter";
		nutzer2.druckeBenutzer();

		
		
	}
	
	
	public  void druckeBenutzer (){
		
		System.out.println(vorname+" "+nachname+" "+firma  );
	}
	
}
