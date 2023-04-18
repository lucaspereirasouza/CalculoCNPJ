package br.com.logica.array;

public class Array3 {

	public static void main(String[] args) {
		int[] num=new int [100];
		int p = 0;
		for(int x=0;x<100;x++){
			if(x%3==0){
			num[p] = x;
			p++;
		}
	}
	for(int i=0;i<num.length;i++) {
		if (num[i]!=0) {
		System.out.println(num[i]);
		}
	}
	}
}
