package Exercises;

public class Funcionario {
	private String nome; 
	private double salario;
	public Funcionario (String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public void setSalario (double salario) {
		this.salario = salario;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return this.nome;
	}
	public double getSalario () {
		return this.salario;
	}
}
