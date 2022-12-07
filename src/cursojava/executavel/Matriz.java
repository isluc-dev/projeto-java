package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class Matriz {
	
	public static void main(String[] args) {
		int notas[][] = new int[2][3];
		
		notas[0][0] = 89;
		notas[0][1] = 78;
		notas[0][2] = 68;
		
		notas[1][0] = 45;
		notas[1][1] = 74;
		notas[1][2] = 54;
		
		System.out.println(notas);
		
		for(int posLinha = 0; posLinha < notas.length; posLinha++) {//percorrendo as linas
			
			for(int posColunas = 0; posColunas < notas[posLinha].length; posColunas++) {// percorrendo as colunas
				
				System.out.println("valor da matriz:  " + notas[posLinha][posColunas]);
				
			}
			
			
		}
		/* trabalahando com conversao de texto para array com o split*/
		  String texto = "mauricio,curso java , 78,79,68,90";
		  
		  String[] valoresArrays = texto.split(",");
		  
		  System.out.println("nome   :"+valoresArrays[0]);
		  System.out.println("curso  :"+valoresArrays[1]);
		  System.out.println("nota 1 :"+valoresArrays[2]);
		  System.out.println("nota 2 :"+valoresArrays[3]);
		  System.out.println("nota 3 :"+valoresArrays[4]);
		  System.out.println("nota 4 :"+valoresArrays[5]);
		  
		  //CONVERTENDO ARRAYS PARA LISTA
		  
		  List<String> list = Arrays.asList(valoresArrays);
		  
		  for (String valorString : list) {
			  
			System.out.println(valorString);
			
		}
		  // CONVERTENDO LISTA PARA UM ARRAY
		  String[] conversaoArray = list.toArray(new String[6]);
		  
		  for(int pos = 0; pos < conversaoArray.length; pos++) {
			  System.out.println(conversaoArray[pos]);
		  }
	}

}
