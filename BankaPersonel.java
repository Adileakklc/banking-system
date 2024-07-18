package nyp2023proje;

import java.util.ArrayList;

//BankPersonel sinifi, Kiþi sinifindan kalitim alir
class BankaPersonel extends Kisi {
 private ArrayList<Musteri> musteriler;

 public BankaPersonel(String ad, String soyad, int yas, String adres, String telefonno, String email, int personelId, int idNo) {
     super(ad, soyad, yas, adres, telefonno, email);
     this.musteriler = new ArrayList<Musteri>();
 }

 // Musteri ekleme metodu
 public void addMusteri(Musteri musteri) {
     this.musteriler.add(musteri);
 }

 // Musteri silme metodu
 public void removeMusteri(Musteri musteri) {
     this.musteriler.remove(musteri);
 }
}