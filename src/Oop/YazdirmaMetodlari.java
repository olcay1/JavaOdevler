package Oop;

public class YazdirmaMetodlari {

	static void fatihBilisimOkuluProgramBasligiYazdir() {
		System.out.println("***************************************\r\n" + "********* Fatih Biliþim Okulu *********\r\n"
				+ "***************************************");

	}

	static void programBasligiYazdir(String parametre) {
		System.out.println("***************************************\r\n" + "****************" + parametre
				+ "*******************\r\n" + "***************************************");

	}

	static void ayracYazdir() {
		System.out.println("\r\n***************************************");

	}

	static void islemSonucuYazdir(String yazdirilmakIstenenBaslik, int yazdirilmakIstenenDeger) {

		System.out.println("** " + yazdirilmakIstenenBaslik + " = " + yazdirilmakIstenenDeger + "**");

	}

}
