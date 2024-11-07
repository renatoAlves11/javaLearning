package PF_2023_1;

public class LivroDeLivraria extends Livro{
	private boolean vendido;
	public LivroDeLivraria(int ano, boolean vend) {
		super(ano);
		this.vendido = vend;
	}
	public boolean getVendido() {
		return vendido;
	}
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
}
