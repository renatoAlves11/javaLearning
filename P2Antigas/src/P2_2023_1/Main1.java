package P2_2023_1;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] array = new String[5];
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextLine();
		}
		ArrayList<Pais> paises = CriaPaises.retornaPaises(array);
		Pais buscado = new Pais(sc.nextLine());
		if(!(paises.contains(buscado))) {
			System.out.println("Não existe na lista");
		}
		else {
			int index = paises.indexOf(buscado);
			System.out.println(paises.get(index));
			System.out.println(paises.get(index).getFronteira());
		}
	}
}
