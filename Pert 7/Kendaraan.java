class Motor {
	protected String jenis;

	public Motor(String jenis1) {
		jenis=jenis1;
	}
	public void cetakMotor() {
		System.out.println("Jenis Motor : "+jenis);
	}
}
class Mobil extends Motor {
	protected int jumlahPenumpang;

	public Mobil(String jenis1, int jumlahPenumpang1) {
		super(jenis1);
		jumlahPenumpang=jumlahPenumpang1;
	}
	public void cetakMobil() {
		System.out.println("\nJumlah Penumpang Mobil : "+jumlahPenumpang);
	}
}
class Pesawat extends Mobil {
	protected String namaMaskapai;

	public Pesawat(String jenis1, int jumlahPenumpang1, String namaMaskapai1) {
		super(jenis1, jumlahPenumpang1);
		namaMaskapai=namaMaskapai1;
	}
	public void cetakPesawat() {
		System.out.println("\nNama Maskapai Pesawat : "+namaMaskapai);
	}
}
public class Kendaraan {
	public static void main(String[] args) {
		Pesawat pe=new Pesawat("Sport", 8, "Garuda Indonesia");
		pe.cetakMotor();
		pe.cetakMobil();
		pe.cetakPesawat();
	}
}