class Toko {
	private int cabangToko; //Hanya boleh diakses di dalam kelas Toko
	protected String namaToko;
	protected String alamatToko;
	public void infoToko() {
		cabangToko=2;
		System.out.println("Cabang Toko Ke-"+cabangToko);
	}
	public void cetakToko() {
		System.out.println("Nama Toko: "+namaToko);
		System.out.println("Alamat: "+alamatToko);
	}
}
class PC extends Toko { //kelas PC turunan kelas Toko
	protected String merk;
	protected String tipe;
	protected int tahun;
	public void cetakPC() {
		infoToko(); //diizinkan karena infoToko() bersifat public
		System.out.println("\nMerk PC: "+merk);
		System.out.println("Tipe PC: "+tipe);
		System.out.println("Tahun Rilis PC: "+tahun);
	}
}
class Smartphone extends PC { //kelas Smartphone turunan kelas PC
	public void cetakSmartphone() {
		System.out.println("\nMerk Smartphone: "+merk); //dapat diakses karena protected
		System.out.println("Tipe Smartphone: "+tipe); //dapat diakses karena protected
		System.out.println("Tahun Rilis Smartphone: "+tahun); //dapat diakses karena protected
		System.out.println();
	}
}
public class Program3 {
	public static void main(String[] args) {
		Toko a=new Toko(); //diizinkan, karena kelas Toko satu paket dengan kelas Program3
		a.namaToko="Ika N Elec"; //diizinkan, karena namaToko protected
		a.alamatToko="Bandung"; //diizinkan, karena alamatToko protected
		a.cetakToko(); //diizinkan, karena cetakToko() anggota kelas Toko

		PC b=new PC(); //diizinkan, karena kelas PC satu paket dengan kelas Program3
		b.merk="Lenovo"; //diizinkan, karena merk protected
		b.tipe="IdeaPad Slim 3"; //diizinkan, karena tipe protected
		b.tahun=2020; //diizinkan, karena tahun protected
		b.cetakPC(); //diizinkan, karena cetakPC() anggota kelas PC

		Smartphone c=new Smartphone(); //diizinkan, karena kelas Smartphone satu paket dengan kelas Program3
		c.merk="Iphone"; //diizinkan, karena merk protected
		c.tipe="13 Pro"; //diizinkan, karena tipe protected
		c.tahun=2021; //diizinkan, karena tahun protected
		c.cetakSmartphone(); //diizinkan, karena cetakSmartphone() anggota kelas Smartphone
	}
}