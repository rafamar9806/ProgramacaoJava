package entradaesaida;

import javax.swing.JOptionPane;

public class Adicao {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Insira o primeiro numero");
		String n2 = JOptionPane.showInputDialog("Insira o segundo numero");
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		String titulo = "Soma";
		
		int soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null, String.format("A soma de %d + %d é %d", num1,num2,soma), titulo, JOptionPane.PLAIN_MESSAGE);

	}

}
