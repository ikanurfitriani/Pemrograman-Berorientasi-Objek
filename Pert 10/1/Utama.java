class SepedaBalap {
	protected String rek;
	public SepedaBalap(String rek1) {
		rek=rek1;
	}
	public void tampil() {
		System.out.println("=== Rekomendasi Sepeda Terbaik ===");
		System.out.println("1. Sepeda Balap: "+rek);
		System.out.println();
	}
}
class SepedaLipat extends SepedaBalap {
	private String rekomen;
	public SepedaLipat(String rek1, String rekomen1) {
		super(rek1);
		rekomen=rekomen1;
	}
	public void tampil() {
		System.out.println("=== Rekomendasi Sepeda Terbaik ===");
		System.out.println("1. Sepeda Balap: "+rek);
		System.out.println("2. Sepeda Lipat: "+rekomen);
		System.out.println();
	}
}
public class Utama {
	public static void main(String[] args) {
		SepedaBalap s; 	//objek s berbentuk SepedaBalap
		s=new SepedaBalap("Element Roadbike FRC 38"); 	//objek s diikatkan pada SepedaBalap
		s.tampil(); 	//objek s menjalankan metode tampil() milik SepedaBalap
		s=new SepedaLipat("RoadBike Exotic 2708","United Black Horse");  //objek s diikatkan pada SepedaLipat (berubah menjadi SepedaLipat)
		s.tampil(); 	//objek s menjalankan metode tampil() milik SepedaLipat
		s=new SepedaBalap("Pacific Primum 3.3"); 	//objek s diikatkan pada SepedaBalap (berubah menjadi SepedaBalap)
		s.tampil(); 	//objek s menjalankan metode tampil() milik SepedaBalap
	}
}