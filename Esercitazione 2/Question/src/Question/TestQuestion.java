package Question;

import java.util.Scanner;
import java.util.Random;

public class TestQuestion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random gen = new Random();
		
		int[] scelte = {1,4,6};
		
		int punteggio = 0;
		
		Question qst[] = new Question[5];
		qst[0] = new Question ("Formula chimica di Acqua: ", "H2O", 3);
		qst[1] = new QuestionYesNo ("Formula chimica di Acqua ии H2O? (True/False): ", true, 1);
		qst[2] = new NumericQuestion ("1+1?: ", 2 , 1);
		qst[3] = new Question ("Formula chimica di Ossigeno: ","O",3);
		qst[4] = new MultipleQuestion ("1+0? Scegliere: \n1-> 1\n2-> 4\n3-> 6", scelte, 1, 3);
		
	//	System.out.print(qst[3].getRisposta());
		
		for(int i = 0; i < qst.length; i++) {
			System.out.println(qst[i].getDomanda());
			String str = scn.nextLine();
			punteggio += qst[i].ask(str);
		}
		
		System.out.println("Punteggio ottenuto: " + punteggio);
		
		punteggio = 0;
		
		for(int i = 0; i < 3; i++) {
			int d = gen.nextInt(qst.length);
			System.out.println(qst[d].getDomanda());
			String str = scn.nextLine();
			punteggio += qst[d].ask(str);
		}
		
		System.out.println("Punteggio ottenuto: " + punteggio);
		
		scn.close();
		
		
	}

}
