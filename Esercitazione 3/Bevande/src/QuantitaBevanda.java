// Esercizio 3: Approvvigionamento Distributore.

public class QuantitaBevanda {

		private int quantita = 0;
		private Bevanda bevanda;
		
		public QuantitaBevanda(int quantita, Bevanda bevanda) {
			super();
			if(quantita > 0)
				this.quantita = quantita;
			
			this.bevanda = bevanda;
		}

		public int getQuantita() {
			return quantita;
		}

		public void setQuantita(int quantita) {
				this.quantita = quantita;
		}

		public Bevanda getBevanda() {
			return bevanda;
		}

		public void setBevanda(Bevanda bevanda) {
			if(bevanda != null)
				this.bevanda = bevanda;
		}
}

