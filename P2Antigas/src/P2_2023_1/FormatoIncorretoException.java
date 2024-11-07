package P2_2023_1;

public class FormatoIncorretoException extends Exception {
	public FormatoIncorretoException(int qtdHash, String incorreta) {
		super(String.format("%d Hashtags na frase %s", qtdHash, incorreta));
	}
}
