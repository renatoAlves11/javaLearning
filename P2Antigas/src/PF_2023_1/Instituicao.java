package PF_2023_1;

import java.util.ArrayList;

public class Instituicao {
	private String nome;
	private ArrayList<Livro> listaDeLivros = new ArrayList<Livro>();
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void insereLivro(Livro o) {
		listaDeLivros.add(o);
	}
	public ArrayList<Livro> getLivros(){
		return listaDeLivros;
	}
}
