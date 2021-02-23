package person;

public class MainStagista {	

	public static void main(String[] args) {
		Stagista[] stg = new Stagista[3];
		
		stg[0] = new Stagista("Mario","Super","MARSUP01B19Z210Q","Brooklyn", 200, "MR_STAGE_1");
		stg[1] = new Stagista("Luigi","Super","LUISUP02B19Z210Q","Tokyo", 230, "MR_STAGE_2");
		stg[2] = new Stagista("Yoshi","Super","YOSSUP03B19Z210Q","New York", 103, "MR_STAGE_3");
		
		int maxValue = stg[0].bornYear();
		int maxId = 0;
		for(int i = 0; i < stg.length; i++) {
			if(maxValue < stg[i].bornYear()) {
				maxValue = stg[i].bornYear();
				maxId = i;
			}
		}
		
		System.out.println("Nome: " + stg[maxId].getName());
		System.out.println("Cognome: " + stg[maxId].getSurname());
		System.out.println("Cod. Fiscale: " + stg[maxId].getTax_code());
		System.out.println("Citt¨¤: " + stg[maxId].getCity());
		System.out.println("Ore di presenze: " + stg[maxId].getNumberOfPresence());
		System.out.println("ID Stage: " + stg[maxId].getIdNumber());
		System.out.println("Anno di Nascita: " + stg[maxId].bornYear());
		
		
	}

}

