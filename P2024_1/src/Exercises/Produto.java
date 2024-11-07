package Exercises;

public class Produto {
	private String id;
	private String cor;
	private double preco;
	public Produto(String id) {
		this.id = id;
	}
	public double getPreco() {
		return preco;
	}
	@Override
	public String toString() {
		return String.format("ID: %s%nCor: %s%n Preço: %.2f%n", id, cor, preco);
	}
}
