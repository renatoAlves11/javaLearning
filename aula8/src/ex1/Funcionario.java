package ex1;

public class Funcionario {
	private String id;
	private String nome;
	private double salario;
	public Funcionario(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public boolean equals(Object x) {
		if(x instanceof Funcionario) {
			if(((Funcionario)x).getId() == this.id) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s - %.2f", this.id, this.nome, this.salario);
	}
}
