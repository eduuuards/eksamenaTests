package eksamenaTests;

public class Tests {

	public static void main(String[] args) {
	System.out.println("Tests par skaitliskam funkcijam");
	System.out.println("Pareizas atbildes ievadi kopa bez atstarpem alfabeta seciba.");

	String j1 = "Kuri datu tipi strādā ar cipariem?\n"
			+"[a] int  [b] double [c] String";
	String j2 = "Kuras  atbildes raksturo datu tipu 'double'?\n"
			+"[a] Cipari  [b] Burti [c] Decimaldalas [d] Cikls";
	
	
	
	
	Jautajums [] jautajumi = {
			new Jautajums(j1, "ab"),
			new Jautajums(j2, "ac")
	}
	}
	
	
	public static void testaIzpilde(Jautajums [] jautajumi) {
		
		
	}

}
