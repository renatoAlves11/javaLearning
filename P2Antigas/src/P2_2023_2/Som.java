package P2_2023_2;

public class Som extends Acessorio{
	public Som(String marca, double preco) {
		super(marca,preco);
	}
	public double calcularImposto() {
		return getPreco() * 0.3;
	}
}
