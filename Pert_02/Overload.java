public class Overload { //OVERLOADING DENGAN beda tipe data

	public void perkalian(int x, int y){ //metode perkalian ke-1
		System.out.println("Hasil perkalian dari method ke-1 = "+(x * y));
    }

    public void perkalian(int x, float y){ //metode perkalian ke-2
		System.out.println("Hasil perkalian dari method ke-2 = "+(x * y));
    }

    public void perkalian(double x, float y){ //metode perkalian ke-3
	    System.out.println("Hasil perkalian dari method ke-3 = "+(x * y));
    }

    public void perkalian(float x, int y, double z){ //metode perkalian ke-4
        System.out.println("Hasil perkalian dari method ke-4 = "+(x * y * z));
    }

    public static void main(String[] args) { //metode program utama
        Overload kali = new Overload();
        kali.perkalian(4, 8);
        kali.perkalian(7, 5.5f);
        kali.perkalian(9.2, 2.4f);
        kali.perkalian(3.1f, 4, 6.5);
    }
}