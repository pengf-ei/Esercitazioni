package Question;

public class Question {
	private String domanda;
	private String risposta;
	private int punteggio = 0;
	
	public Question(String domanda, String risposta, int punteggio) {
		super();
		this.domanda = domanda;
		this.risposta = risposta;
		if(punteggio > 0)
			this.punteggio = punteggio;
	}

	public Question(String domanda, int punteggio) {
		super();
		this.domanda = domanda;
		this.punteggio = punteggio;
	}



	public String getDomanda() {
		return domanda;
	}

	public String getRisposta() {
		return risposta;
	}

	public int getPunteggio() {
		return punteggio;
	}

	public void setDomanda(String domanda) {
		if(domanda != null)
			this.domanda = domanda;
		else
			System.out.println("Domanda nulla");
	}

	public void setRisposta(String risposta) {
		if(risposta != null)
			this.risposta = risposta;
		else
			System.out.println("Risposta nulla");
	}

	public void setPunteggio(int punteggio) {
		if(punteggio > 0)
			this.punteggio = punteggio;
		else
			System.out.println("Errore: Punteggio <= 0");
	}
	
	public int ask(String risposta) {
		if(risposta != null) {
			if(risposta.equalsIgnoreCase(this.risposta))
				return punteggio;
			else
				return 0;
		} else if(this.risposta == null)
					return punteggio;
				else
					return 0;
	}
	

}
