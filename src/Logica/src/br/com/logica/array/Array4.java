package br.com.logica.array;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 1990;
		int[] data = new int[30];
		int m = 0;
		
		for (int i=0;i<=30;i++) {
			//System.out.println(i);
			val++;
			if(i%4==0) {
				data[m]=val;
				m++;
			}
			
		}
		
		
		for (int i=0;i<=data.length;i++) {
			System.out.println(data[i]);
		}
		
	}

}
