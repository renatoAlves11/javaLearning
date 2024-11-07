package P2_2023_2;

public class TextoCurtoException extends Exception{
	public TextoCurtoException() {
		
	}
	public TextoCurtoException(int qtd) {
		System.out.println("texto inserido com " + qtd + " caracteres");
	}
}
