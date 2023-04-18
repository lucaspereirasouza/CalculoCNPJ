package br.com.logica.desvioif;

import java.util.Scanner;

public class EstruturaF1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner input = new Scanner (System.in);

		System.out.println("Digite um número: ");
		num = input.nextInt();
		
		if (num %2 == 0) 
			System.out.println("numero par");
		else 
			System.out.println("Numero impar");
	}

}
