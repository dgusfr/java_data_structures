package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class RentPro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		
		System.out.println("Quantos quartos serão reservados?");
		int n = sc.nextInt();
		
		Rent r = new Rent("Maria", "maria@email.com");
		
		System.out.println(r);
		
		sc.close();
	}

}
