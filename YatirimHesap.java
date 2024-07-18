package nyp2023proje;

//Yatirim hesabi sinifi
public class YatirimHesap {
	private double yatirimBakiyesi;
	private String yatirimTuru;
	private double dovizKuru;
	
	public YatirimHesap(double yatirimBakiyesi, String yatirimTuru, double dovizKuru) {
		this.yatirimBakiyesi=yatirimBakiyesi;
		this.yatirimTuru=yatirimTuru;
		this.dovizKuru=dovizKuru;
	}
	
	public double getYatirimBakiyesi() {
		return yatirimBakiyesi;
	}
	public void setYatirimBakiyesi(double yatirimBakiyesi) {
		this.yatirimBakiyesi=yatirimBakiyesi;
	}
	
	public String getYatirimTuru() {
		return yatirimTuru;
	}
	public void setYatirimTuru(String yatirimTuru) {
		this.yatirimTuru=yatirimTuru;
	}
	
	public double getDovizKuru() {
		return dovizKuru;
	}
	public void setDovizKuru(double dovizKuru) {
		this.dovizKuru=dovizKuru;
	}
	
	public void yatirimYap(double yatirimTutar) {
		double yatirilanTutar=yatirimTutar*dovizKuru;
		this.yatirimBakiyesi += yatirilanTutar;
	}
	
	public void ParaCek(double cekilenTutar) {
		if(cekilenTutar > yatirimBakiyesi)
		{
			System.out.println("Yetersiz bakiye");
		}else {
			this.yatirimBakiyesi -= cekilenTutar;
		}
	}
}
