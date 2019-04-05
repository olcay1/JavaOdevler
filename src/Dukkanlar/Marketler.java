package Dukkanlar;

public class Marketler extends Dukkan {
	int subeSayisi;
	String urunAd;
	double fiyat;
	
	int adet;
	double toplamTutar;
	
	void alisverisYap() {
		toplamTutar=adet*fiyat;
		
		System.out.println("aldýðýnýz "+ urunAd +"için "+ toplamTutar+ "ödeme tutarýnýzdýr." );
		
	}
	

}
