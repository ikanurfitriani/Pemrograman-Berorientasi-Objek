class SepedaBalap {
	protected String merk;

	public SepedaBalap(String merk1) {
		merk=merk1;
	}
	public void showBalap() {
		System.out.println("=====SEPEDA BALAP=====");
		System.out.println("Merk Sepeda Balap: "+merk);
	}
}
class SepedaGunung extends SepedaBalap { //kelas turunan
	protected String tipe;

	public SepedaGunung(String merk1, String tipe1) {
		super(merk1);
		tipe=tipe1;
	}
	public void showGunung() {
		System.out.println("\n=====SEPEDA GUNUNG=====");
		System.out.println("Tipe Sepeda Gunung: "+tipe);
	}
}
class SepedaTandem extends SepedaGunung { //kelas turunan
	protected int jumlahSeat;

	public SepedaTandem(String merk1, String tipe1, int jumlahSeat1) {
		super(merk1, tipe1);
		jumlahSeat=jumlahSeat1;
	}
	public void showTandem() {
		System.out.println("\n=====SEPEDA TANDEM=====");
		System.out.println("Jumlah Seat Sepeda Tandem: "+jumlahSeat);
	}
}
public class Sepeda {
	public static void main(String[] args) {
		SepedaTandem a=new SepedaTandem("Polygon", "Altitude Alloy 30", 4);
		a.showBalap();
		a.showGunung();
		a.showTandem();
	}
}