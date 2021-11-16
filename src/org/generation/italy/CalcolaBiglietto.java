package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		/*
		 * chiedo età + km
		 * calcolo prezzo (0.21 € al km)
		 * applico sconto
		 * if <18 20% sconto
		 * else if >= 65 40% sconto
		 * else per gli altri
		 */
		
		
		// init Scanner
		Scanner scanner = new Scanner(System.in);
		
		double km;
		double age;
		double ticketPrice;
		double eurXKm = 0.21;

		System.out.print("Insert number of kilometers: ");
		km = scanner.nextDouble();
		System.out.print("Insert age: ");
		age = scanner.nextDouble();
		
		ticketPrice = (km * eurXKm);
		
		double scontoGgiovani = 0.2 * ticketPrice;
		double scontoOver65 = 0.4 * ticketPrice;
		
		if(age < 18) {
			System.out.println(ticketPrice - scontoGgiovani);
		} else if(age >= 65) {
			System.out.println(ticketPrice - scontoOver65);
		}else {
			System.out.println(ticketPrice);
		}
		

		
		
		//close Scanner
		scanner.close();

	}

}
