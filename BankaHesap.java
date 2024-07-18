package nyp2023proje;

//Banka hesabi sinifi
public class BankaHesap {
	private String HesapTuru;
	private double HesapBakiye;
	private int acilisTarihi;
	private static String parola;
	
	public BankaHesap(String isim,String parola, String hesapTuru, double hesapBakiye, int acilisTarihi) {
		this.parola = parola;
		this.HesapTuru=hesapTuru;
		this.HesapBakiye=hesapBakiye;
		this.acilisTarihi=acilisTarihi;
    }
	
	public String getHesapTuru() {
		return HesapTuru;
	}
	public void setHesapTuru(String hesapTuru) {
		HesapTuru= hesapTuru;
	}
	
	public double getHesapBakiye() {
		return  HesapBakiye;
	}
	public void setHesapBakiye(double hesapBakiye) {
		HesapBakiye= hesapBakiye;
	}
	
	public int getAcilisTarihi() {
		return acilisTarihi;
	}
	public void setAcilisTarihi(int acilisTarihi) {
		this.acilisTarihi=acilisTarihi;
	}
	
	public static String getParola() {	
		return parola;
	}
	public void setParola(String parola) {
        this.parola = parola;
    }
	
	public double paraYatir(double para) {
		HesapBakiye += para;
		return HesapBakiye;
	}
	
	public void paraCek(double para) {
		if(para > HesapBakiye) {
			System.out.println("Bu miktarda parayý çekemezsiniz");
		}
		else {
			this.HesapBakiye -= para;
			System.out.println("Yeni Bakiye = " + this.HesapBakiye);
		}
	}

	public static Object getAd() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
