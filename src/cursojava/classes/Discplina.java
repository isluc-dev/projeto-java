package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

public class Discplina {
	
	private String discplina;
	private double[] nota = new double[4];
	public String getDiscplina() {
		return discplina;
	}
	public void setDiscplina(String discplina) {
		this.discplina = discplina;
	}
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Discplina [discplina=" + discplina + ", nota=" + Arrays.toString(nota) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(discplina);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discplina other = (Discplina) obj;
		return Objects.equals(discplina, other.discplina) && Arrays.equals(nota, other.nota);
	}
	
	
	public double getMediaNotas() {
		double somaTotal = 0;
		
		for(int pos = 0; pos < nota.length; pos++) {
			somaTotal += nota[pos];
		}
		return somaTotal / 4;
	}
	
	
	

}
