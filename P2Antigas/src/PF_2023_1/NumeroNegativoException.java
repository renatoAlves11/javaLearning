package PF_2023_1;

public class NumeroNegativoException extends Exception{
	public NumeroNegativoException() {
		
	}
public NumeroNegativoException(double a) {
		System.out.printf("O número %.2f é negativo, insira apenas números positivos", a);
	}
}
