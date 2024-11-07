package PF_2023_1;

import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Instituicao a = new Instituicao();
		a.insereLivro(new LivroDeBiblioteca(1984, true));
		a.insereLivro(new LivroDeBiblioteca(2000, false));
		a.insereLivro(new LivroDeLivraria(1500, false));
		a.insereLivro(new LivroDeLivraria(2058, true));
		a.getLivros().get(0).setISBN("pato");
		imprimeRelatorioGeral(a.getLivros());
		System.out.println("Qual o ISBN a ser consultado?");
		Scanner sc = new Scanner(System.in);
		Livro buscado = new LivroDeBiblioteca(1234, false);
		buscado.setISBN(sc.nextLine());
		if(a.getLivros().contains(buscado)) {
			int idxBuscado = a.getLivros().indexOf(buscado);
			System.out.println(a.getLivros().get(idxBuscado));
		}
		else System.out.println("livro não encontrado");
	}
	public static void imprimeRelatorioGeral(List<Livro> livros) {
		Iterator<Livro> x = livros.iterator();
		while(x.hasNext()) {
			Livro a = x.next();
			System.out.print(a.getNome() + " " + a.getAno() + " ");
			if(a instanceof LivroDeBiblioteca) {
				if(((LivroDeBiblioteca) a).getAlugado()) {
					System.out.println("alugado");
				}
				else System.out.println("não alugado");
			}
			if(a instanceof LivroDeLivraria) {
				if(((LivroDeLivraria)a).getVendido()) {
					System.out.println("vendido");
				}
				else System.out.println("não vendido");
			}
		}
	}
}
