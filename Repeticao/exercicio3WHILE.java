package Repeticao;

import java.util.Scanner;

public class exercicio3WHILE {
/*
 * Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int idade = 0, menos21 = 0, mais50 = 0;

		while(idade!=-99)
		{
			System.out.print("Digite a sua idade. Use -99 para encerrar: ");
			idade = input.nextInt();
			if(idade<21 && idade>0)
				menos21 += 1;
			else if(idade>50)
				mais50 += 1;
		}
		System.out.println("Existe um total de "+menos21+" com idade menor que 21 anos"+
				"\nExiste um total de "+mais50+" com idade maior que 50 anos");		
		System.out.println("Fim do programa");
		
	}

}