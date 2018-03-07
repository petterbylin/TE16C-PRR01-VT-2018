package lessons.interfaces;

import java.util.Scanner;

public class exceptions {

	public static void main(String[] args) {

		char gissning = '-';

		while (gissning == '-') {
			try {
				gissning = gissa();
			} catch (ToLongGuessException e) {
				System.err.println("För lång gissning. Gissa igen");
			} catch (NotAlphabeticException e) {
				System.err.println("Inte en bokstav. Gissa igen");
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
		}
		
		System.out.println("Du gissade på: " + gissning);

	}

	public static char gissa() throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Skriv in en bokstav: ");

		String in = sc.nextLine();

		if (in.length() != 1) {
			throw new ToLongGuessException();
		}

		char guess = in.charAt(0);

		if (!Character.isAlphabetic(guess)) {
			throw new NotAlphabeticException();
		}

		return guess;

	}

}
