package br.com.logica.desvioif;

public class EstruturaIF2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1,nota2,nota3,nota4,media;
		nota1 = Double.parseDouble (JOptionPane.showInputDialog("Digite a primeira nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
		nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota"));
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 5)
			JOptionPane.showMessageDialog(null, "A média do aluno é "+media+" está Aprovado");
		else
			JOptionPane.showMessageDialog(null, "A média do aluno é "+media+" está Reprovado");
	}

}
