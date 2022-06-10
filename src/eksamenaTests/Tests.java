package eksamenaTests;

import java.util.Scanner;

public class Tests {

	public static void main(String[] args) {
	System.out.println("Tests par skaitliskam funkcijam");
	System.out.println("Pareizas atbildes ievadi kopa bez atstarpem alfabeta seciba.");

	String j1 = "\nKuri datu tipi strada ar cipariem?\n"
			+"[a] int  [b] double [c] String\n";
	String j2 = "Kuras  atbildes raksturo datu tipu 'double'?\n"
			+"[a] Cipari  [b] Burti [c] Decimaldalas [d] Cikls";
	
	
	
	
	Jautajums [] jautajumi = {
			new Jautajums(j1, "ab"),
			new Jautajums(j2, "ac")
	
	};
	testaIzpilde(jautajumi);
	
	}
	
	public static void testaIzpilde(Jautajums [] jautajumi) {
		Scanner read = new Scanner(System.in);
		
		for(int i=0; i<jautajumi.length; i++) {
			String atbilde;
			do {
			System.out.println(jautajumi[i].jaut);
			atbilde = read.nextLine();
			}while(!atbilde.equals(jautajumi[i].atbilde));
				
			
		
		
		}
		System.out.println("Tests ir pabeigts.");
		read.close();
	}

}

