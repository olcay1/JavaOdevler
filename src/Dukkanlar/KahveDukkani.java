package Dukkanlar;

public class KahveDukkani extends Dukkan {
	boolean yemekVarmi;
	int Puan;	
	String kahveIsim;
	String ozelUrunu;
	

	void degerlendirme() {
		if (Puan>=3) {
			System.out.println(kahveIsim+ " çok güzel");
			System.out.println(ozelUrunu+ " denemelisiniz");
			
		}
		else {
			System.out.println("baþka bir kahve denemeliyim.");
		}
	}

}
