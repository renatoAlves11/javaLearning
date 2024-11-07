package Exercises;

import java.util.List;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		List funcs = Utils.getFuncionarios();
		Funcionario [] array = Utils.parseFuncionarios(funcs);
		System.out.print(Utils.calcularMediaSalarios(array));
	}
}
