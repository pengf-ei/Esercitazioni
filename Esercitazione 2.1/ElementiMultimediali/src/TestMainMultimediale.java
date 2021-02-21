import java.util.Scanner;

public class TestMainMultimediale {

	public static void main(String[] args) {
		Object[] em = new Object[5];
		
		@SuppressWarnings("resource")
		Scanner choose = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner name = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner lum = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner dur = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner vol = new Scanner(System.in);
		
		int i;
		for(i = 0; i < 5; i++) {
			
			int scelta = 0;
			int luminosita = -1;;
			int durata = -1;
			int volume = -1;
			String nome;
			
			System.out.println("1) Immagine");
			System.out.println("2) Audio");
			System.out.println("3) Filmato");
			System.out.println("Scelta:");
			
			scelta = choose.nextInt();
			
			System.out.println("Inserire il nome:");
			nome = name.nextLine();
			
			if(scelta == 1 || scelta == 3) {
				System.out.println("Inserire la luminosita:");
				luminosita = lum.nextInt();
			}
			
			if(scelta == 2 || scelta == 3) {
				System.out.println("Inserire la durata:");
				durata = dur.nextInt();
				System.out.println("Inserire il volume:");
				volume = vol.nextInt();
			}
			
			switch (scelta) {
			case 1:
				em[i] = new Immagine(nome, luminosita);
				break;
			case 2:
				em[i] = new Audio(nome, durata, volume);
				break;
			case 3:
				em[i] = new Filmato(nome, durata, volume, luminosita);
				break;
			}
		
		}
				
		int scelta;
		String s;
		do {
			System.out.println("Scelta di esecuzione 1-5: (0 per terminare)");
			scelta = choose.nextInt() -1;
			if(scelta >=0 && scelta <=4) {
				((ElementoMultimediale) em[scelta]).esegui();
			
			
				//verificare la classe
				s = em[scelta].getClass().getSimpleName();
				if(s.equals("Immagine") || s.equals("Filmato")) {
					System.out.println("1) Abbassare luminosit¨¤");
					System.out.println("2) Aumentare luminosit¨¤");
					System.out.println("altro) Non cambiare");
					int sceltaLum = choose.nextInt();
					if(sceltaLum == 1)
						((ConImmagine) em[scelta]).darker();
					if(sceltaLum == 2)
						((ConImmagine) em[scelta]).brighter();
				}
				
				if(s.equals("Audio") || s.equals("Filmato")) {
					System.out.println("1) Abbassare volume");
					System.out.println("2) Aumentare volume");
					System.out.println("altro) Non cambiare");
					int sceltaVol = choose.nextInt();
					if(sceltaVol == 1)
						((Riproducibile) em[scelta]).lower();
					if(sceltaVol == 2)
						((Riproducibile) em[scelta]).weaker();
					
				}
			}
			
			
			scelta++;
		}
		while(scelta != 0);
		
		
		choose.close();
		name.close();
		lum.close();
		dur.close();
		vol.close();

	}

}
