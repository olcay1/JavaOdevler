package Dukkanlar;

public class Program {

	public static void main(String[] args) {
		Marketler market = new Marketler();
		market.setDukkanAd("a101");
		market.urunAd="ekmek";
		market.adet=3;
		market.fiyat=1.25;
		market.calisanSayisi=4;
		market.alisverisYap();
		
		KahveDukkani kahveDukkani= new KahveDukkani();
		kahveDukkani.setDukkanAd("Hatr-ý Kahve");
		kahveDukkani.adres="Üsküdar, Ýstanbul";
		kahveDukkani.kahveIsim="Filtre Kahve";
		kahveDukkani.Puan=4;
		kahveDukkani.ozelUrunu="White Flat kahvesi muhteþem olan bu mekan";
		kahveDukkani.degerlendirme();
		
		
		
		

	}

}
