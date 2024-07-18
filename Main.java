package nyp2023proje;

public class Main {

    public static void main(String[] args) {
        
        // Banka hesaplar� olu�turuluyor
        BankaHesap b1 = new BankaHesap("Arda" ,"1453","TL", 5000.00, 2015);
        BankaHesap b2 = new BankaHesap("Ayhan" ,"1923", "USD", 2000.00, 2014);
        BankaHesap hesap = new BankaHesap("Adile Akk�l�c","1945","TL",89.00,3400);
        
        // Kredi kartlar� olu�turuluyor
        KrediKarti k1 = new KrediKarti(1962196319691971L, 5000.00, 0.00, 5000);
        KrediKarti k2 = new KrediKarti(1972197319871988L, 10000.00, 0.00, 10000);
        
        // M��teriler olu�turuluyor
        Musteri m1 = new Musteri("Arda",  "Turan", "12341278231", "1001", b1, k1);
        Musteri m2 = new Musteri("Ayhan", "Akman", "23499783512", "1002", b2, k2);
        
        // Banka personelleri olu�turuluyor
        BankaPersonel p1 = new BankaPersonel("Hakan", "Cetin", 35, "Antalya", "555-2205", "hakan.cetin@bankapersonel.com", 100, 51385);
        BankaPersonel p2 = new BankaPersonel("Selcuk", "Inan", 28, "Ankara", "555-1705", "selcuk.�nan@bankapersonel.com", 101, 53498);
        
        // M��teriler personellere atan�yor
        p1.addMusteri(m1);
        p1.addMusteri(m2);
        p2.addMusteri(m1);
        
        // Hesaplara ve kartlara para yat�r�l�yor
        b1.paraYatir(2000);
        b2.paraYatir(500);
        hesap.paraYatir(500);
        k1.odemeYap(1000);
        k2.odemeYap(2000);
        
        // Bilgiler yazd�r�l�yor
        System.out.println(m1.getAdres() + " " + m1.getAd() +" " + m1.getSoyad() + "'n�n bakiyesi: " + b1.getHesapBakiye() + " " + b1.getHesapTuru());
        System.out.println(m2.getAdres() + " " + m2.getAd() +" "+ m2.getSoyad() + "'�n bakiyesi: " + b2.getHesapBakiye() + " " + b2.getHesapTuru());
        System.out.println(m1.getAdres() + " " + m1.getAd() +" " +m1.getSoyad() + "'n�n kredi kart� borcu: " + k1.getGuncelBorc());
        System.out.println(m2.getAdres() + " " + m2.getAd() +" "+ m2.getSoyad() + "'�n kredi kart� borcu: " + k2.getGuncelBorc());
    }

}
