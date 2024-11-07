package hello;

import java.util.ArrayList;

public class Hello {
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		lista.add(6);
		lista.add(3);
		lista.add(2);
		int product = product(lista);
		System.out.printf("Produto: %d", product);
	}
	public static int product(ArrayList<Integer> arrayList) {
		int [] array = new int[arrayList.size()];
		int product = 1;
		for(int i = 0; i < arrayList.size(); i++) {
			array[i] = arrayList.get(i);
		}
		for(int i = 0; i < arrayList.size(); i++) {
			if(i == 0) {
				product = array[i];
			}
			else {
				product = product * array[i];
			}
		}
		return product;
	}
}
