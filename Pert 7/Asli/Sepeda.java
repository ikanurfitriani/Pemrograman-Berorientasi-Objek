class SepedaBalap {
	protected String merk;

	public SepedaBalap() {
		this.merk = "Shadow";
	}
	public void showBalap() {
		System.out.println("=====SEPEDA BALAP=====");
		System.out.println("Merk Sepeda Balap: "+merk);
	}
}
class SepedaGunung extends SepedaBalap { //kelas Kurang turunan kelas Jumlah
	protected String tipe;

	public SepedaGunung() {
		merk = "Rocky Mountain";
		this.tipe = "Altitude Alloy 30";
	}
	public void showGunung() {
		System.out.println("\n=====SEPEDA GUNUNG=====");
		System.out.println("Merk Sepeda Gunung: "+merk);
		System.out.println("Tipe Sepeda Gunung: "+tipe);
	}
}
class SepedaTandem extends SepedaGunung { //kelas Kurang turunan kelas Jumlah
	protected int jumlahSeat;

	public SepedaTandem() {
		merk = "Polygon";
		tipe = "Impression AX";
		jumlahSeat = 2;
	}
	public void showTandem() {
		System.out.println("\n=====SEPEDA TANDEM=====");
		System.out.println("Merk Sepeda Tandem: "+merk);
		System.out.println("Tipe Sepeda Tandem: "+tipe);
		System.out.println("Jumlah Seat Sepeda Tandem: "+jumlahSeat);
	}
}
public class Sepeda {
	public static void main(String[] args) {
		SepedaBalap a1=new SepedaBalap();
		a1.showBalap();

		SepedaGunung a2=new SepedaGunung();
		a2.showGunung();

		SepedaTandem a3=new SepedaTandem();
		a3.showTandem();
	}
}