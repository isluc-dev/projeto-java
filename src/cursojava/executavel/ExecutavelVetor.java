package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Discplina;

public class ExecutavelVetor {
	
	public static void main(String[] args) {
		
		
		double[] notas = {78,80,89,90};
		
		
		// criação do aluno
		Aluno aluno = new Aluno();
		aluno.setNome("mauricio");
		aluno.setIdade(28);;
		
		//criação da disciplina
		Discplina discplina = new Discplina();
		discplina.setDiscplina("curso java");
		discplina.setNota(notas);
		aluno.getDisciplinas().add(discplina);
		
		
		Discplina discplina2 = new Discplina();
		discplina2.setDiscplina("front-end");
		discplina2.setNota(notas);
		aluno.getDisciplinas().add(discplina2);
		
		
		
		Aluno aluno2 = new Aluno();
		aluno.setNome("lucas");
		aluno.setIdade(01);;
		
		//criação da disciplina
		Discplina discplina1 = new Discplina();
		discplina1.setDiscplina("curso java");
		discplina1.setNota(notas);
		aluno.getDisciplinas().add(discplina1);
		
		
		Discplina discplina3 = new Discplina();
		discplina3.setDiscplina("front-end");
		discplina3.setNota(notas);
		aluno2.getDisciplinas().add(discplina3);
		
		
	/*  System.out.println("nome do aluno : " + aluno.getNome());
	  
	  for(Discplina d : aluno.getDisciplinas()) {
		  System.out.println("Disciplina : " + d.getDiscplina());
		  
		  System.out.println("notas das ciscplinas");
		  
		  double notaMax = 0.0;
		  for(int pos = 0; pos < notas.length; pos++) {
			  System.out.println("Nota " + pos + ": " + d.getNota()[pos]);
			  
			  if(notaMax == 0) {
				  notaMax = d.getNota()[pos];
			  }else if(d.getNota()[pos] > notaMax) {
				  
				  notaMax = d.getNota()[pos];
				  
				  
			  }
			  
		  }
		  System.out.println("a nota maxima do aluno : " + d.getDiscplina() + ": " + notaMax );
			
	  }*/
	  
	  //=====================================================================
	  
	  Aluno[] alunos = new Aluno[2];
	  
	  alunos[0]= aluno;
	  alunos[1]= aluno2;
	  
	  for(int pos = 0; pos < alunos.length; pos++) {
		  System.out.println("nome do aluno : " + alunos[pos].getNome());
		  
		  for(Discplina d : alunos[pos].getDisciplinas()) {
			  System.out.println("discplina : " + d.getDiscplina());
			  
			  for(int posNotas = 0; posNotas < d.getNota().length; posNotas++) {
				  System.out.println("Notas das Discplina : " + posNotas + " : " + d.getNota()[posNotas]);
			  }
		  }
	  }
	  
	}

}
