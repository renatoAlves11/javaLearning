package P2_2023_2;

public abstract class Acessorio {
	private String marca;
	private double preco;
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public double getPreco() {
		return preco;
	}
	public abstract double calcularImposto();
	public Acessorio(String marca, double preco) {
		this.marca = marca;
		this.preco = preco;
	}
}