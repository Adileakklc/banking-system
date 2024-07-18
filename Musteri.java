package nyp2023proje;

import java.util.ArrayList;
//Musteri sinifi
public class Musteri extends Kisi {
	private String musteriNo;
    private BankaHesap bankaHesap;
    private KrediKarti krediKarti;
    private ArrayList<Kredi> krediler;
    private ArrayList<YatirimHesap> yatirimHesaplari;
    
    public Musteri(String ad, String soyad, String tcKimlikNo, String musteriNo, 
                   BankaHesap bankaHesap, KrediKarti krediKarti) {
    	super(ad, soyad, 0, tcKimlikNo, "", "");
        this.musteriNo = musteriNo;
        this.bankaHesap = bankaHesap;
        this.krediKarti = krediKarti;
        this.krediler = new ArrayList<>();
        this.yatirimHesaplari = new ArrayList<>();
    }
    
    // Getter ve Setter metotlarý
    public String getMusteriNo() {
        return musteriNo;
    }
    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public BankaHesap getBankaHesap() {
        return bankaHesap;
    }
    public void setBankaHesap(BankaHesap bankaHesap) {
        this.bankaHesap = bankaHesap;
    }

    public KrediKarti getKrediKarti() {
        return krediKarti;
    }
    public void setKrediKarti(KrediKarti krediKarti) {
        this.krediKarti = krediKarti;
    }

    public ArrayList<Kredi> getKrediler() {
        return krediler;
    }
    public void setKrediler(ArrayList<Kredi> krediler) {
        this.krediler = krediler;
    }

    public ArrayList<YatirimHesap> getYatirimHesaplari() {
        return yatirimHesaplari;
    }
    public void setYatirimHesaplari(ArrayList<YatirimHesap> yatirimHesaplari) {
        this.yatirimHesaplari = yatirimHesaplari;
    }
}

