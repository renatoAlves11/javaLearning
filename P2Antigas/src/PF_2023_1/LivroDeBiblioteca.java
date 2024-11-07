package PF_2023_1;

public class LivroDeBiblioteca extends Livro {
	private boolean alugado;
	public LivroDeBiblioteca(int ano, boolean alug) {
		super(ano);
		this.alugado = alug;
	}
	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
	public boolean getAlugado() {
		return alugado;
	}
}
