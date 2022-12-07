package cursojava.executavel;

import javax.swing.JOptionPane;

public class ClasseVetor {
	
	public static void main(String[] args) {
		
		/*arrays pode ser todos dos tipos de dados e objetos tambem 
		 * e sempre deve ter a quantidade de posições definidas */
		
		
		String posicoes = JOptionPane.showInputDialog("digite quantas  posição tem o array");
		double[] notas = new double [Integer.valueOf(posicoes)];
		notas[0] = 10.0;
		notas[1] = 8.5;
		notas[2] = 7.75;
		notas[3] = 6.0;
		
		
		for(int poss = 0; poss < notas.length; poss++) {
			String valor = JOptionPane.showInputDialog("digite io valor da nota" + poss);
			notas[poss] = Double.valueOf(valor);
			
		}
		
		for(int pos = 0; pos < notas.length; pos++) {
			System.out.println("a nota " + (pos + 1) +" : " + notas[pos]);
		}
	}

}
