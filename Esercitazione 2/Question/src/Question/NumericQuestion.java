package Question;

public class NumericQuestion extends Question {

	public NumericQuestion(String domanda, int risposta, int punteggio) {
		super(domanda, String.valueOf(risposta), punteggio);
	}

	public int ask(String risposta) {
		if(risposta != null && Integer.parseInt(risposta) == Integer.parseInt(this.getRisposta()))
			return this.getPunteggio();
		else 
			return 0;
	}
	
	

}
