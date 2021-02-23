package Question;

public class NumericQuestion extends Question {

	public NumericQuestion(String domanda, int risposta, int punteggio) {
		super(domanda, String.valueOf(risposta), punteggio);
	}

	public int ask(String risposta) {
		if(risposta != null) {
			
			if(risposta.matches("[+-]?\\d+")) {
				int seInt = Integer.parseInt(risposta);
				if(seInt >= 0 || seInt < 0 ) {
					if(seInt == Integer.parseInt(this.getRisposta()))
					return this.getPunteggio();
					}
			}
		}
		return 0;
	}
	
	

}
