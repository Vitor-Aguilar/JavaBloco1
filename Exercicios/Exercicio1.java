package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		
		
		System.out.println("1° numero: ");
		num1 = scan.nextInt();
		
		System.out.println("2° numero: ");
		num2 = scan.nextInt();
		
		System.out.println("3° numero: ");
		num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O primeiro número é o maior.");
			
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O segundo número é o maior.");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("O terceiro número é o maior.");
		}
		
		scan.close();
	}

}