class Layanglayang {
	double sisiA, sisiB, dg1, dg2; //membuat variabel dengan tipe data double
	double keliling, luas; //membuat variabel dengan tipe data double

	public double keliling() {
		return((2*sisiA) + (2*sisiB));
	}
	public double luas() {
		return(dg1*dg2/2);
	}
	public Layanglayang() {
		sisiA=6.0;
		sisiB=8.0;
		dg1=3.0;
		dg2=5.0;
	}
	public Layanglayang(double sA, double sB, double d1, double d2) {
		sisiA=sA;
		sisiB=sB;
		dg1=d1;
		dg2=d2;
	}
	public Layanglayang(Layanglayang ly) {
		sisiA=ly.sisiA;
		sisiB=ly.sisiB;
		dg1=ly.dg1;
		dg2=ly.dg2;
	}
}
public class Main1 {
	public static void main (String[] args) {
		Layanglayang ly0=new Layanglayang();
		System.out.println("Layang-layang ke 1");
		System.out.println("Keliling = "+ly0.keliling());
		System.out.println("Luas = "+ly0.luas());

		Layanglayang ly1=new Layanglayang(3.0, 4.0, 1.0, 3.0);
		System.out.println("Layang-layang ke 2");
		System.out.println("Keliling = "+ly1.keliling());
		System.out.println("Luas = "+ly1.luas());

		Layanglayang ly2=new Layanglayang(12.0, 16.0, 6.0, 10.0);
		System.out.println("Layang-layang ke 3");
		System.out.println("Keliling = "+ly2.keliling());
		System.out.println("Luas = "+ly2.luas());
	}
}