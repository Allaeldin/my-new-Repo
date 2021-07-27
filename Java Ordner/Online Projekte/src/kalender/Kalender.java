package kalender;

import java.util.Scanner;

public class Kalender {
	public static void main(String... args) {

		String[][][][] kalender = new String[10][12][][];
		for (int i = 0; i < kalender.length; i++) {
			for (int j = 0; j < kalender[i].length; j++) {

				switch (j) {
				case 0:

					kalender[i][j] = new String[31][24]; // Januar

					break;

				case 1:

					kalender[i][j] = new String[28][24]; // Februar

					break;

				case 2:

					kalender[i][j] = new String[31][24]; // März

					break;

				case 3:

					kalender[i][j] = new String[30][24]; // April

					break;

				case 4:

					kalender[i][j] = new String[31][24]; // Mai

					break;
				case 5:

					kalender[i][j] = new String[30][24]; // Juni

					break;

				case 6:

					kalender[i][j] = new String[31][24]; // Juli

					break;

				case 7:

					kalender[i][j] = new String[31][24]; // August

					break;

				case 8:

					kalender[i][j] = new String[30][24]; // Septemper

					break;

				case 9:

					kalender[i][j] = new String[31][24]; // Oktober
					break;
				case 10:

					kalender[i][j] = new String[30][24]; // November

					break;

				case 11:

					kalender[i][j] = new String[31][24]; // Dezember

					break;

				default:
					break;
				}
			}

		}
		
		kalender[0][1]= new String[29][24];
		kalender[4][1]= new String[29][24];
		kalender[8][1]= new String[29][24];

		for (int i = 0; i < kalender.length; i++) {
			for (int j = 0; j < kalender[i].length; j++) {

				for (int k = 0; k < kalender[i][j].length; k++) {
					for (int a = 0; a < kalender[i][j][k].length; a++) {
						
						
						kalender[i][j][k][a] = "";

					}
				}
			}
		}

		
	
		
	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Bitte geben sie ein Jahr ein zwischen (2020-2029)");
		
		int jahr = scanner.nextInt();
		
		jahr = (jahr-2020);
		System.out.println("Bitte geben Sie ein Monat ein(1-12)");
		
		int monat = scanner.nextInt();
		
		monat = monat -1;
		
		
		System.out.println("Bitte geben Sie ein Tag ein(1-"+kalender[jahr][monat].length+")");
		int tag = scanner.nextInt();
		tag = tag -1;
		
		
		System.out.println("Bitte geben Sie eine Uhrzeit ein (1-24");
		int uhrzeit = scanner.nextInt();
		
		uhrzeit = uhrzeit-1;
		System.out.println("Bitte geben Sie den Eintrag ein");
		String eintrag= scanner.next();
		kalender[jahr][monat][tag][uhrzeit] = eintrag;
		
		

		System.out.println(" Bitte geben sie ein Jahr ein zwischen (2020-2029)");
		
		jahr = scanner.nextInt();
		
		jahr = (jahr-2020);
		System.out.println("Bitte geben Sie ein Monat ein(1-12)");
		
	   monat = scanner.nextInt();
		
		monat = monat -1;
		System.out.println("Bitte geben Sie ein Tag ein(1-"+kalender[jahr][monat].length+")");
		 tag = scanner.nextInt();
		tag = tag -1;
		
		for (int i = 0; i < kalender[jahr][monat][tag].length; i++) {
			
			if(!kalender[jahr][monat][tag][i].equals("")) {
			System.out.println("Uhrzeit: "+(i+1)+" "+kalender[jahr][monat][tag][i]);
			}
			
		}
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
