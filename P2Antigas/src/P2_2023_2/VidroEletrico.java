package P2_2023_2;

public class VidroEletrico extends Acessorio{
	public VidroEletrico(String marca, double preco) {
		super(marca, preco);
	}
	public double calcularImposto() {
		return getPreco() * 0.2;
	}

}
