package ex1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] funcs = new String [5];
		System.out.println("Entre com as Strings:");
		for(int i = 0; i < 5; i++) {
			funcs[i] = sc.nextLine();
		}
		List x = Utils.retornaDados(funcs);
		for(Object y : x) {
			System.out.println((Funcionario)y);
		}
		Utils.mediaFuncs(x);
	}
}
