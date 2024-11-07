package P2_2023_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Pais {
		private String nome;
		private String cod;
		private double populacao;
		private double dimensao;
		ArrayList<Pais> fronteira = new ArrayList<Pais>();
		public Pais(String cod) {
			String aux = cod.toUpperCase();
			this.cod = aux;
		}
		public Pais(String cod, String nome, double dimensao) {
			this(cod);
			this.nome = nome;
			this.dimensao = dimensao;
		}
		public void setPopulacao(double populacao) {
			this.populacao = populacao;
		}
		public void setDimensao(double dimensao) {
			this.dimensao = dimensao;
		}
		public double getDimensao() {
			return this.dimensao;
		}
		public double getPopulacao() {
			return this.populacao;
		}
		public String getCod() {
			return cod;
		}
		public ArrayList<Pais> getFronteira(){
			return this.fronteira;
		}
		public boolean fazFronteira(Pais o) {
			if(fronteira.contains(o)) return true;
			return false;
		}
		
		public void atribuiFronteiras(Pais o) {
			fronteira.add(o);
		}
		
		public double densidadePopulacional() {
			return (double)(this.populacao / this.dimensao);
		}
		
		@Override
		public boolean equals(Object o) {
			if(o instanceof Pais) {
				if(((Pais)o).getCod().equals(this.cod)) {
					return true;
				}
			}
			return false;
		}
		
		@Override
		public String toString() {
			return String.format("Nome:%s, densidade:%f", this.nome, densidadePopulacional());
		}
		
}
