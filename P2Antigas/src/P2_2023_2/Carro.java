package P2_2023_2;

import java.util.List;
import java.util.ArrayList;

public class Carro {
	private String placa;
	private String cor;
	private int ano;
	private String renavan;
	private List<Acessorio> acessorios = new <Acessorio> ArrayList();
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}
	public String getPlaca() {
		return placa;
	}
	public String getCor() {
		return cor;
	}
	public int getAno() {
		return ano;
	}
	public String getRenavan() {
		return renavan;
	}
	public List<Acessorio> getAcessorio(){
		return acessorios;
	}
	public void adicionaAcessorio(Acessorio o) {
		acessorios.add(o);
	}
}
