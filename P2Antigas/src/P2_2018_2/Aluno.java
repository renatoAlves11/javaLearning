package P2_2018_2;

public class Aluno implements Comparable<Aluno>{
	private String id;
	private String nome;
	private double nota;
	public Aluno(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public int compareTo(Aluno x) {
		return this.id.compareTo(x.getId());
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Aluno) {
			return this.id.equals(((Aluno)o).getId());
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("ID:%s%nNome:%s%nNota:%f%n", id, nome, nota);
	}
	
}
