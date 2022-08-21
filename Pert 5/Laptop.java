public class Laptop {
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
	public void cetakLaptop() {
		System.out.println("");
		System.out.println("Merk Laptop: "+this.merk);
		System.out.println("Tipe Laptop: "+this.tipe);
		System.out.println("Tahun Rilis Laptop: "+this.tahun);
	}
}