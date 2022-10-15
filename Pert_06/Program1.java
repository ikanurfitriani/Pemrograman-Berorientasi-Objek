class Jumlah {
	protected int angka1;
	protected int angka2;
	public void showJumlah() {
		System.out.println("\nHasil penjumlahan: "+(angka1+angka2));
	}
}
class Kurang extends Jumlah { //kelas Kurang turunan kelas Jumlah
	public void showKurang() {
		System.out.println("\nHasil pengurangan: "+(angka1-angka2)); //dapat diakses karena protected
		System.out.println();
	}
}
public class Program1 {
	public static void main(String[] args) {
		Jumlah a=new Jumlah(); //diizinkan, karena kelas Jumlah satu paket dengan kelas Program1
		a.angka1=15; //diizinkan, karena angka1 protected
		a.angka2=7; //diizinkan, karena angka2 protected
		a.showJumlah(); //diizinkan, karena showJumlah() anggota kelas Jumlah

		Kurang b=new Kurang(); //diizinkan, karena kelas Kurang satu paket dengan kelas Program1
		b.angka1=24; //diizinkan, karena angka1 protected
		b.angka2=6; //diizinkan, karena angka2 protected
		b.showJumlah(); //diizinkan, karena showJumlah() bersifat public
		b.showKurang(); //diizinkan, karena showKurang() anggota kelas Kurang
	}
}