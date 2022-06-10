package eksamenaTests;

import java.util.Scanner;

public class Tests {

	public static void main(String[] args) {
	System.out.println("Tests par skaitliskam funkcijam");
	System.out.println("Pareizas atbildes ievadi kopa bez atstarpem alfabeta seciba.");

	String j1 = "\nKuri datu tipi strada ar cipariem?\n"
			+"[a] int  [b] double [c] String [d]SQL\n ";
	
	String j2 = "Kuras  atbildes raksturo datu tipu 'double'?\n"
			+"[a] Cipari  [b] Burti [c] Decimaldalas [d] Cikls\n";
	
	String j3 = "Kuras  atbildes raksturo datu tipu 'String'?\n"
			+"[a] Teksts  [b] Burti [c] Cipari [d] For Cikls\n";
	
	String j4 = "Kuras funkcijas pieder trigonometrijai?\n"
			+"[a] sin()  [b] pow() [c] tan() [d] abs()\n";
	
	String j5 = "Cik argumentus vajag funkcijai pow() ?\n"
			+"[a] 2 [b] vairak par 1 bet mazak par 3 [c] 1 [d] 4 \n";
	
	String j6 = "Kuras funkcijas sanemot divas vertibas, dara vienu un to pasu tikai otradi? ?\n"
			+"[a] pow() [b] min() [c] sqrt() [d] max() \n";
	
	String j7 = "Kuras funkcijas ir vienadas?\n"
			+"[a] acos() [b] cos() [c] Math.cos() [d] cosine() \n";
	
	String j8 = "Kuras funkcijas atgriez double vertibu??\n"
			+"[a] floor() [b] ceil() [c] round() [d] rint() \n";
	
	
	Jautajums [] jautajumi = {
			new Jautajums(j1, "ab"),
			new Jautajums(j2, "ac"),
			new Jautajums(j3, "abc"),
			new Jautajums(j4, "ac"),
			new Jautajums(j5, "ab"),
			new Jautajums(j6, "bd"),
			new Jautajums(j7, "bc"),
			new Jautajums(j8, "abd")
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

