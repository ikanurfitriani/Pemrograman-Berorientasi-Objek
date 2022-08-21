class Balok {
	double pj, lb, tg; //membuat variabel dengan tipe data double

	public double keliling() {
		return(4*(pj+lb+tg));
	}
	public double luas() {
		return(2*(pj*lb+pj*tg+lb*tg));
	}
	public double volume() {
		return(pj*lb*tg);
	}
	public Balok() {
		pj=6.0;
		lb=8.0;
		tg=10.0;
	}
	public Balok(double p, double l, double t) {
		pj=p;
		lb=l;
		tg=t;
	}
	public Balok(Balok ba) {
		pj=ba.pj;
		lb=ba.lb;
		tg=ba.tg;
	}
}
public class Main2 {
	public static void main (String[] args) {
		Balok ba0=new Balok();
		System.out.println("Balok ke 1");
		System.out.println("Keliling = "+ba0.keliling());
		System.out.println("Luas Permukaan = "+ba0.luas());
		System.out.println("Volume = "+ba0.volume());

		Balok ba1=new Balok(3.0, 4.0, 5.0);
		System.out.println("Balok ke 2");
		System.out.println("Keliling = "+ba1.keliling());
		System.out.println("Luas Permukaan = "+ba1.luas());
		System.out.println("Volume = "+ba1.volume());

		Balok ba2=new Balok(12.0, 16.0, 20.0);
		System.out.println("Balok ke 3");
		System.out.println("Keliling = "+ba2.keliling());
		System.out.println("Luas Permukaan = "+ba2.luas());
		System.out.println("Volume = "+ba2.volume());
	}
}