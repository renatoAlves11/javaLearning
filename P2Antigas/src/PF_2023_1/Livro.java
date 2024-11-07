package PF_2023_1;

public abstract class Livro {
	private String nome;
	private String autor;
	private int ano;
	private String ISBN;
	public String getNome() {
		return nome;
	}
	public String getAutor() {
		return autor;
	}
	public int getAno() {
		return ano;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	public Livro(int ano) {
		this.ano = ano;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Livro) {
			return ISBN.equals(((Livro)o).getISBN());
		}
		return false;
	}
	@Override
	public String toString() {
		return nome + " " + ano + " " + autor;
	}
}
