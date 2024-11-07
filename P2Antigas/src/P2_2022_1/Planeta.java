package P2_2022_1;

public class Planeta extends CorpoCeleste{
	public Planeta(String id) {
		super(id);
	}
	
	@Override
	public String toString() {
		return "[Planeta]" + super.toString();
	}
	
	
}
