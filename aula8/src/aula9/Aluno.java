package aula9;

public class Aluno implements Comparable<Aluno> {
	private String id;
	private String nome;
	private double nota;
	public Aluno(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public String getNome()
	{
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public boolean equals(Object x) {
		if (x instanceof Aluno) {
			if (((Aluno)x).getId().equals(this.id)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int compareTo(Aluno x) {
		return this.nome.compareTo(x.getNome());
	}
	@Override
	public String toString() {
		return String.format("%s - %s - %f", this.id, this.nome, this.nota);
	}
}
