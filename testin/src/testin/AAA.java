package testin;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ArrayList;

public class AAA {
	/*public class Main {
	    public static void main(String[] args) {
	        // Início da contagem de tempo
	        long startTime = System.currentTimeMillis();

	        // Código que você quer medir o tempo de execução
	        for (int i = 0; i < 1000000; i++) {
	            // Simulando uma tarefa
	        }

	        // Fim da contagem de tempo
	        long endTime = System.currentTimeMillis();

	        // Calculando o tempo de execução
	        long executionTime = endTime - startTime;

	        // Exibindo o tempo de execução em milissegundos
	        System.out.println("Tempo de execução: " + executionTime + " milissegundos");
	    }
	}*/

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		ArrayList b = new ArrayList();
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
		//	a.add(i);
			b.add(i);
		}
		//Iterator x = a.iterator();
		Iterator y = b.iterator();
		while(y.hasNext()) {
			//System.out.println(x.next());
			System.out.println(y.next());
		}
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Tempo de execução: " + executionTime + " milissegundos");
	}
	
}
