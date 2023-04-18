package br.com.logica.array;

import java.util.Iterator;

public class Array2 {

	public static void main(String[] args) {
		// Variaveis da arrays
		int[]num= {10,20,3,8,12,19,31};
		int[]outros= {20,6,8,15,78,94,3,200,31};
		// variavel resultado
		int rs=0;
		// Listação de todos os numeros do num
		for (int i = num.length-1;i>=0;i--) {
			System.out.print(num[i]+ " - ");
		}
		//Soma de todos os valores da tabela num
		System.out.println(" ");
		System.out.println("======== Soma dos valores ========");
		for(int i=0;i<num.length;i++) {
			rs += num[i];
		}
		System.out.println("A soma de todos os valores da lacuna 1 = "+rs);
		System.out.println("======== Numeros pares ========");
		for(int i=0;i<num.length;i++) {
			if (num[i]%2==0) {
				System.out.print(num[i]+" | ");
			}
		}
		
		for (int i=0;i<num.length;i++) {
//			System.out.println("Contando os numeros "+num[i]);
			for (int o=0; o<outros.length; o++) {
//				System.out.println("Contando as lacunas"+outros[o]);
					if (num[i]==outros[o]) {
					System.out.println("Iguais!! "+num[i]);  //print NOT LB sames [prim val>>numval]
					}
			}
		}
	}
}
