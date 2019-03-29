package Oop;

import java.util.ArrayList;
import java.util.Random;

public class OgrenciEkle {

	void ekle() {

		Random rnd = new Random();
		ArrayList<Ogrenci> ogrenciArray = new ArrayList<Ogrenci>();

		for (int i = 0; i < 10; i++) {
			KelimeUretec kelimeUretec = new KelimeUretec(10);
			ogrenciArray.add(new Ogrenci(kelimeUretec.kelime, rnd.nextInt(100)));

		}

		for (int i = 0; i < ogrenciArray.size(); i++) {

			System.out.println("No:" + ogrenciArray.get(i).ogrenciNo + "  - Ogrenci ad: " + ogrenciArray.get(i).ogrenciAd);

		}
	}
}
