package Question;

public class MultipleQuestion extends Question {
	private int rispostaCorretta;

	public MultipleQuestion(String domanda, int[] risposte, int rispostaCorretta, int punteggio) {
		super(domanda, punteggio);
		
		if(risposte != null) {
			String concat = String.valueOf(risposte[0]);
			for(int i = 1; i < risposte.length; i++) {
				concat += ";" + String.valueOf(risposte[i]);
			}
			super.setRisposta(concat);
			
			for(int i = 0; i < risposte.length; i++) {
				if(rispostaCorretta == risposte[i]) {
					this.rispostaCorretta = rispostaCorretta;
					break;
				}
			}
		} else
			super.setRisposta(null);
		

	}
	
	public void setRisposta(int[] risposte) {
		if(risposte != null) {
			String concat = String.valueOf(risposte[0]);
			for(int i = 1; i < risposte.length; i++) {
				concat += ";" + String.valueOf(risposte[i]);
			}
			super.setRisposta(concat);
		}
	}
	
	public int getRispostaCorretta() {
		return rispostaCorretta;
	}

	public void setRispostaCorretta(int rispostaCorretta) {
		this.rispostaCorretta = rispostaCorretta;
	}
	
	public int ask(String r) {
		if(r != null) {
			if(r.matches("\\d")) {
				int risposta = Integer.parseInt(r);
				
				if(this.getRisposta() != null) {
					String [] str = this.getRisposta().split(";");
					
					if(risposta >= 1 && risposta <= str.length) {
						
						int [] ind = new int[str.length];
						
						for(int j = 0; j < ind.length; j++) {
							ind[j] = Integer.parseInt(str[j]);
						}
						
						if(ind[risposta-1] == rispostaCorretta)
							return this.getPunteggio();
						
					}
				}
			}
		}
			
		return 0;
	}

}
