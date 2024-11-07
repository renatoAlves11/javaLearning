package PF_2023_1;

import java.util.Scanner;

public class ProgramaPrincipal2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		try {
			double media = MeuNumero.media(texto);
			System.out.println("A media é " + media);
		} catch(NumeroNegativoException e) {
			System.out.println(e);
		}
	}
}
