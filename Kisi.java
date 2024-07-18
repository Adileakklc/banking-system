package nyp2023proje;

import java.util.Scanner;
//Kisi sinifi
class Kisi{
	private String ad;
	private String soyad;
	private String adres;
	private int yas;
	private String email;
	private String telefonno;
	private Scanner scanner;
	
	public Kisi(String ad, String soyad, int yas, String adres, String telefonno, String email) {
		this.ad=ad;
		this.soyad=soyad;
		this.yas=yas;
		this.adres=adres;
		this.telefonno=telefonno;
		this.email=email;
		this.scanner = new Scanner(System.in);
	}
	
    public boolean authenticate(BankaHesap bankahesap) {
		System.out.println("Kullanýcý adý = ");
		String kullaniciAdi = scanner.nextLine();
		
		System.out.println("Parola = ");
		String parola = scanner.nextLine();
		
		return BankaHesap.getAd().equals(kullaniciAdi) && BankaHesap.getParola().equals(parola);
	}
	
	
	//getter ve setter metodlarý
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad=ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad=soyad;
	}
	
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres=adres;
	}
	
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas=yas;
	}
	
	public String getTelefonNo() {
		return telefonno;
	}
	public void setTelefonNo(String telefonno) {
		this.telefonno=telefonno;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
}




