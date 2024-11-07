package P2_2023_2;

import java.util.Scanner;

public class ProgramaPrincipal2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		try {
			Utils.verifica(string);
			System.out.println(Utils.moderar(string));
		}catch(TextoCurtoException e) {
			System.out.println(e);
		}
	}
}
