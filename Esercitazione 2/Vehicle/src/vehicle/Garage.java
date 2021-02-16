package vehicle;

public class Garage {
	public Garage() {
		super();
	}

	public int repair(Vehicle v) {
		if(v != null) {
			int costo = 0;
			String nomeClasse = v.getClass().getSimpleName();
			
			if(nomeClasse.equals("Car")) {
				String tip = ((Car) v).getTipologia();
				
				if(tip.equalsIgnoreCase("normale"))
					costo += 158;
				
				if(tip.equalsIgnoreCase("utilitario"))
					costo += 130;
				
				if(tip.equalsIgnoreCase("suv"))
					costo += 105;
				
				if(tip.equalsIgnoreCase("station wagon"))
					costo += 100;
				
			}
			
			if(nomeClasse.equals("Motocycle")) {
				int cilindrata = ((Motocycle) v).getCilindrata();
				
				if(cilindrata <= 50)
					costo += 50;
				
				if(cilindrata <= 125)
					costo += 90;
				
				if(cilindrata > 125)
					costo += 135;
			}
			
			if(v.isGuasto())
				costo += 100;
			
			return costo;
			
		} else
			return -1;
		
	}
		
		
}
