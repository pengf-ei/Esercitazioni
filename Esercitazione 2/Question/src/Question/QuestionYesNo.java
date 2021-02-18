package Question;

public class QuestionYesNo extends Question {

	public QuestionYesNo(String domanda, boolean rispostaBoolean, int punteggio) {
		super(domanda, String.valueOf(rispostaBoolean), punteggio);
	}

	public int ask(String risposta) {
			if(risposta != null && Boolean.parseBoolean(risposta) == Boolean.parseBoolean(this.getRisposta()))
				return this.getPunteggio();
			else
				return 0;
		}

}
