package personal.exercise;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		
		int pinCorretto = 1234;
		int pinUtente;
		int i = 1;
		
		Scanner Scanner = new Scanner(System.in);
		
		
//		System.out.println("Inserisci il tuo pin");
//		pinUtente = Integer.parseInt(Scanner.nextLine());
		
		do
		{
			System.out.println("Inserisci il tuo pin");
			pinUtente = Integer.parseInt(Scanner.nextLine());
			System.out.println("Il pin inserito è " + pinUtente);
			
			if (!(pinUtente==pinCorretto))
			{
				System.out.println("Il pin inserito non è corretto");
			}
			else
			{
				System.out.println("Accesso consentito");
				break;
			}
			
			i++;
		}
		while(i<=3);
		
		if (i>3)
		{
			System.out.println("Hai sbagliato pin 3 volte, la tua carta ora è bloccata per 24 ore");
		}
		
		
		
		
		Scanner.close();
		
		
		
		
		
		
		
	}

}
