package Exercises;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Utils {
	public static List getFuncionarios() {
		Scanner sc_double = new Scanner (System.in);
		Scanner sc_int = new Scanner (System.in);
		Scanner sc_string = new Scanner (System.in);
		int escolha = 1;
		System.out.println("Escreva nome e salario para cada funcionario");
		List<String> funcs = new ArrayList<String>();
		do {
			funcs.add(String.format("%s#%.2f", sc_string.nextLine(), sc_double.nextDouble()));
			System.out.println("Deseja adicionar mais um funcionario? (1 - Sim, 0 - Não)");
			escolha = sc_int.nextInt();
		} while(escolha != 0);
		return funcs;
	}
	public static Funcionario[] parseFuncionarios(List dados) {
		Funcionario [] funcs = new Funcionario [dados.size()];
		for (int i = 0; i < funcs.length; i++) {
			String [] array = ((String)dados.get(i)).split("#");
			funcs[i] = new Funcionario(array[0], Double.parseDouble(array[1].replaceAll(",", ".")));
		}
		return funcs;
	}
	public static double calcularMediaSalarios(Funcionario[] funcionarios) {
		int funcs = funcionarios.length;
		double salTotal = 0;
		for (int i = 0; i < funcs; i++) {
			salTotal += funcionarios[i].getSalario();
		}
		double media = salTotal/funcs;
		return media;
	}
}
