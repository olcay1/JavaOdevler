package Oop;

import java.util.Random;

public class KelimeUretec {

	String kelime = "";

	public KelimeUretec(int kacHarf) {

		int dizielemanNo = 0;
		char harfler;
		int harfSayisi = kacHarf;
		char[] harflerDizi = new char[26];

		Random rnd = new Random();

		for (harfler = 'A'; harfler <= 'Z'; harfler++) {

			harflerDizi[dizielemanNo] = harfler;
			dizielemanNo++;

		}

		for (int j = 0; j < harfSayisi; j++) {

			kelime += harflerDizi[rnd.nextInt(26)];

		}

	}

}
