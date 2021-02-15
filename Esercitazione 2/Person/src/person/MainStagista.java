package person;


public class MainStagista {
	
	
	public static boolean ordineDecrescente(Stagista[] interi) {
		
		if(interi != null) {
			for(int i = 0; i < interi.length -1; i++) {
				int attuale = i;
				
				for(int succ = i+1; succ < interi.length; succ++)
					if(interi[succ].bornYear() > interi[attuale].bornYear())
						attuale = succ;
				
				Stagista cache = interi[attuale];
				interi[attuale] = interi[i];
				interi[i] = cache;
			}
			return true;
		} else
			return false;

	}
	

	public static void main(String[] args) {
		Stagista[] stg = new Stagista[3];
		
		stg[0] = new Stagista("Mario","Super","MARSUP95B19Z210Q","Brooklyn", 200, "MR_STAGE_1");
		stg[1] = new Stagista("Luigi","Super","LUISUP00B19Z210Q","Tokyo", 230, "MR_STAGE_2");
		stg[2] = new Stagista("Yoshi","Super","YOSSUP90B19Z210Q","New York", 103, "MR_STAGE_3");
			
		boolean check = ordineDecrescente(stg);
		
		if(check == true) {
			System.out.println("Nome: " + stg[0].getName());
			System.out.println("Cognome: " + stg[0].getSurname());
			System.out.println("Cod. Fiscale: " + stg[0].getTax_code());
			System.out.println("Citt¨¤: " + stg[0].getCity());
			System.out.println("Ore di presenze: " + stg[0].getNumberOfPresence());
			System.out.println("ID Stage: " + stg[0].getIdNumber());
			System.out.println("Anno di Nascita: " + stg[0].bornYear());
		} else
			System.out.println("Errore dati passati.");
		
	}

}
