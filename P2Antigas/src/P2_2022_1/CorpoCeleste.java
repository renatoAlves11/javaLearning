package P2_2022_1;

import java.util.Set;

public class CorpoCeleste implements Comparable<CorpoCeleste>{
	private String id;
	private String nome;
	private double distancia;
	public CorpoCeleste(String id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	@Override
	public boolean equals(Object a) {
		if(a instanceof CorpoCeleste) {
			return id.equals(((CorpoCeleste)a).id);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("ID: %s%nNome:%s%nDistancia:%f%n", id, nome, distancia);
	}
	
	@SuppressWarnings("removal")
	public int compareTo(CorpoCeleste a) {
		return new Double(distancia).compareTo(a.distancia);
	}
	
}
