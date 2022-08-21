import perhitungan.*;
public class Utama {
	public static void main(String[] args) {
		double x;
		Perkalian pk=new Perkalian(12.0, 6.0);
		x=pk.kali();
		System.out.println("Hasil perkalian = "+x);

		Pembagian pb=new Pembagian(255.0, 5.0);
		x=pb.bagi();
		System.out.println("Hasil pembagian = "+x);
	}
}