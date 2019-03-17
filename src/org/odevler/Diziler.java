package org.odevler;

import java.util.Scanner;
import java.util.Random;

public class Diziler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*****************************************************************");
		System.out.println("* Girilen HARF ve ADET sayýsýna göre rastgele kelimeler üretmek *");
		System.out.println("*****************************************************************");
		char harfler;
		int harfSayisi, adet;
		String kelime = "";

		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("Harf sayýsý giriniz= ");
		harfSayisi = sc.nextInt();

		System.out.print("Adet giriniz= ");
		adet = sc.nextInt();

		char[] harflerDizi = new char[26];
		String[] kelimelerDizi = new String[adet];

		int dizielemanNo = 0;

		for (harfler = 'A'; harfler <= 'Z'; harfler++) {

			harflerDizi[dizielemanNo] = harfler;
			dizielemanNo++;

		}

		System.out.println("==========================");

		for (char harf : harflerDizi) {
			System.out.print(harf);

		}
		System.out.println("\n==========================");

		for (int i = 0; i < adet; i++) {
			for (int j = 0; j < harfSayisi; j++) {

				kelime += harflerDizi[rnd.nextInt(26)];

			}
			kelimelerDizi[i] = kelime;
			kelime = "";

		}

		dizielemanNo = 0;
		for (String rastgeleKelime : kelimelerDizi) {
			dizielemanNo++;

			System.out.println(dizielemanNo + ". " + rastgeleKelime);

		}

	}

}
