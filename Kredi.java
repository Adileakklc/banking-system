package nyp2023proje;

//Kredi sinifi
public class Kredi {
	private int krediId;
	private  double krediMiktar;
	private double hesapBakiye;
	
	public Kredi(int krediId, double krediMiktar) {
		this.krediId=krediId;
		this.krediMiktar=krediMiktar;
	}
	public int getKrediId() {
		return krediId;
	}
	public void setKrediId(int krediId) {
		this.krediId=krediId;
	}
	
	public double getKrediMiktar() {
		return krediMiktar;
	}
	public void setKrediMiktar(double krediMiktar) {
		this.krediMiktar=krediMiktar;
	}
	
	public double getHesapBakiye() {
		return hesapBakiye;
	}
	public void setHesapBakiye(double hesapBakiye) {
		this.hesapBakiye=hesapBakiye;
	}
	
	public void KrediVer(double yillikGelir, double musteriNo) {
		double krediMiktar=yillikGelir*0.5;
		this.hesapBakiye +=krediMiktar;
	}
}
