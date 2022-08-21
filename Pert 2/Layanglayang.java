public class Layanglayang
{
	public static void main (String [] args)
	{
		int sisiA, sisiB, d1, d2; //membuat variabel dengan tipe data integer
		double keliling, luas; //membuat variabel dengan tipe data double

		sisiA = 6; //menginput data untuk variabel sisiA
		sisiB = 8; //menginput data untuk variabel sisiA
		d1 = 3; //menginput data untuk variabel d1
		d2 = 5; //menginput data untuk variabel d2

		keliling = (2*sisiA) + (2*sisiB); //proses menghitung keliling layang-layang
		luas = d1*d2/2; //proses menghitung luas layang-layang

		System.out.println("Keliling layang-layang = "+keliling); //mencetak hasil akhir keliling layang-layang
		System.out.println("Luas layang-layang = "+luas); //mencetak hasil akhir luas layang-layang
	}
}