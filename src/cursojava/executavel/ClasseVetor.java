package cursojava.executavel;

public class ClasseVetor {
	
	public static void main(String[] args) {
		
		/*arrays pode ser todos dos tipos de dados e objetos tambem 
		 * e sempre deve ter a quantidade de posições definidas */
		
		
		double[] notas = new double [5];
		notas[0] = 10.0;
		notas[1] = 8.5;
		notas[2] = 7.75;
		notas[3] = 6.0;
		
		for(int pos = 0; pos < 5; pos++) {
			System.out.println("a nota " + pos +" : " + notas[pos]);
		}
	}

}
