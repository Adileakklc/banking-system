package nyp2023proje;

//kredikarti sinifi
public class KrediKarti {
	private long kartNo;
	private double limit;
	private double guncelBorc;
	private double kullanilabilirLimit;
	private int musteriNo;
	
	public KrediKarti(long kartNo, double limit, double guncelBorc, int musteriNo) {
		this.kartNo=kartNo;
		this.limit=limit;
		this.guncelBorc=guncelBorc;
		this.kullanilabilirLimit=limit-guncelBorc;
		this.musteriNo=musteriNo;
	}
	
	public long getKartNo() {
		return kartNo;
	}
	public void setKartNo(int kartNo) {
		this.kartNo=kartNo;
	}
	
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit=limit;
	}
	
	public double getGuncelBorc() {
		return guncelBorc;
	}
	public void setGuncelBorc(double guncelBorc) {
		this.guncelBorc=guncelBorc;
	}
	
	public double getKullanilabilirLimit() {
		return kullanilabilirLimit;
	}
	public void setKullanilabilirLimit(double kullanilabilirLimit) {
		this.kullanilabilirLimit=kullanilabilirLimit;
	}
	
	public int getMusteriNo() {
		return musteriNo;
	}
	public void setMusteriNo(int musteriNo) {
		this.musteriNo=musteriNo;
	}
	
	public void borcOde(double odemeMiktari) {
		guncelBorc -= odemeMiktari;
		kullanilabilirLimit = limit - guncelBorc;
	}

	public void odemeYap(int i) {
		// TODO Auto-generated method stub
	}	
}


