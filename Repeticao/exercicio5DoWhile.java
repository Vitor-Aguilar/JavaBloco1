package Repeticao;

import java.util.Scanner;

public class exercicio5DoWhile {
/*
 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x, soma = 0;
		
		do
		{
			System.out.print("Digite um numero. Use 0 para encerrar: ");
			x = input.nextInt();
			if(x>0)
				soma += x;
		}while(x!=0);
		
		System.out.println("Total: "+soma);
	}

}