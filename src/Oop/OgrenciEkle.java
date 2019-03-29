package Oop;

import java.util.ArrayList;
import java.util.Random;

public class OgrenciEkle {

	ArrayList<Ogrenci> ogrenciArray = new ArrayList<Ogrenci>();

	void ekle() {

		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			KelimeUretec kelimeUretec = new KelimeUretec(10);
			ogrenciArray.add(new Ogrenci(kelimeUretec.kelime, rnd.nextInt(100)));

		}

	}
}
