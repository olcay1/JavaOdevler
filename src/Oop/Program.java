package Oop;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YazdirmaMetodlari.fatihBilisimOkuluProgramBasligiYazdir();
		String parametre = "JAVA";
		System.out.println();
		YazdirmaMetodlari.programBasligiYazdir(parametre);
		YazdirmaMetodlari.ayracYazdir();
		YazdirmaMetodlari.islemSonucuYazdir("Hafta", 4);
		System.out.println();
		System.out.print("harf sayýsý: ");
		Scanner scan = new Scanner(System.in);
		int harfSayisi = scan.nextInt();
		KelimeUretec kelimeUretec = new KelimeUretec(harfSayisi);

		System.out.println(kelimeUretec.kelime);
		System.out.println("\n\röðrenci Listesi");
		OgrenciEkle ogrEkle = new OgrenciEkle();
		ogrEkle.ekle();

		for (int i = 0; i < ogrEkle.ogrenciArray.size(); i++) {

			System.out.println("No:" + ogrEkle.ogrenciArray.get(i).ogrenciNo + "  - Ogrenci ad: "
					+ ogrEkle.ogrenciArray.get(i).ogrenciAd);

		}

	}

}
