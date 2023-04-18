package br.com.logica.repeticao;

import javax.swing.JOptionPane;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
//				n1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero"));
//				n2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com outro numero"));
//						
//				for(int i=n1;i<=n2;i++){
//				rs += i;
//				}
//				JOptionPane.showMessageDialog(null, "O resultado da soma é: "+rs);
			
				
				// TODO Auto-generated method stub
		int num,calc=1,pot;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero"));
		pot = Integer.parseInt(JOptionPane.showInputDialog("Entre com outro numero"));
		calc = num;
		
		for (int i = 1; i < pot ; i++) {
		calc*=num;
		}
		System.out.println(calc);
	}
		
}
