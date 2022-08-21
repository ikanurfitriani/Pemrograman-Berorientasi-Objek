class Kali {
	protected int bil1;
	protected int bil2;
	public void showKali() {
		System.out.println("Hasil perkalian: "+(bil1*bil2));
	}
}
class Bagi extends Kali { //kelas Bagi turunan kelas Kali
	public void showBagi() {
		System.out.println("\nHasil pembagian: "+(bil1/bil2)); //dapat mengakses karena protected
		System.out.println();
	}
}
public class Program2 {
	public static void main(String[] args) {
		Kali a=new Kali(); //diizinkan, karena kelas Kali satu paket dengan kelas Program2
		a.bil1=13; //diizinkan, karena bil1 protected
		a.bil2=8; //diizinkan, karena bil2 protected
		a.showKali(); //diizinkan, karena showKali() anggota kelas Kali

		Bagi b=new Bagi(); //diizinkan, karena kelas Bagi satu paket dengan kelas Program2
		b.bil1=81; //diizinkan, karena bil1 protected
		b.bil2=3; //diizinkan, karena bil2 protected
		b.showBagi(); //diizinkan, karena showBagi() anggota kelas Bagi
	}
}