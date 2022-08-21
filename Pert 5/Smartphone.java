public class Smartphone {
	private String merk;
	private String tipe;
	private int tahun;

	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public int getTahun() {
		return tahun;
	}
	public void setTahun(int tahun) {
		this.tahun = tahun;
	}
	public String getTipe() {
		return tipe;
	}
	public void setTipe(String tipe) {
		this.tipe = tipe;
	}
	public void cetakSmartphone() {
		System.out.println("Merk Smartphone: "+this.merk);
		System.out.println("Tipe Smartphone: "+this.tipe);
		System.out.println("Tahun Rilis Smartphone: "+this.tahun);
	}
}