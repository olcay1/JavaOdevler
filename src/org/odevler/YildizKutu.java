package org.odevler;

import java.util.Scanner;

public class YildizKutu {

	public static void main(String[] args) {
		// test

		// TODO Auto-generated method stub
		Scanner klavyedenOku = new Scanner(System.in);

		System.out.print("Sat�r giriniz = ");
		int satir = klavyedenOku.nextInt();

		System.out.print("S�tun giriniz = ");
		int sutun = klavyedenOku.nextInt();

		for (int satirNumarasi = 1; satirNumarasi <= satir; satirNumarasi++) {

			for (int sutunNumarasi = 1; sutunNumarasi <= sutun; sutunNumarasi++) {

				if (satirNumarasi > 1 && sutunNumarasi > 1 && satirNumarasi < satir && sutunNumarasi < sutun ) {
					System.out.print("  ");
					
				} else {
					System.out.print("* ");
				}

			}
			System.out.println("");
		}

	}

}
