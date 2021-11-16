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
		String kmFormat = String.format("%.2f", km);
		// System.out.println(kmFormat);
		System.out.print("Insert age: ");
		age = scanner.nextDouble();
		String ageFormat = String.format("%.2f", age);
		// System.out.println(ageFormat);
		
		ticketPrice = (km * eurXKm);
		
		double ticketGgiovani = ticketPrice - (0.2 * ticketPrice);
		double ticketOver65 = ticketPrice - (0.4 * ticketPrice);
		String outputMessage;
		

	
		String ticketPriceFormat = String.format("%.2f", ticketPrice);
		String ticketGgiovaniFormat = String.format("%.2f", ticketGgiovani);
		String ticketOver65Format = String.format("%.2f", ticketOver65);
		

		

		if(age < 18) {
			outputMessage = ("Ticket price: " + ticketGgiovaniFormat);
		} else if(age >= 65) {
			outputMessage = ("Ticket price: " + ticketOver65Format);
		}else {
			outputMessage = ("Ticket price: " + ticketPriceFormat);
		}
		
		System.out.println(outputMessage);
		
		
		//close Scanner
		scanner.close();

	}

}
