package Dukkanlar;

public class Marketler extends Dukkan {
	int subeSayisi;
	String urunAd;
	double fiyat;
	
	int adet;
	double toplamTutar;
	
	void alisverisYap() {
		toplamTutar=adet*fiyat;
		
		System.out.println("ald���n�z "+ urunAd +"i�in "+ toplamTutar+ "�deme tutar�n�zd�r." );
		
	}
	

}
