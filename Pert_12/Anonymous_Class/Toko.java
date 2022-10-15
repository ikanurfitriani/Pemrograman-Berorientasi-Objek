//interface
interface Informasi {
	String detail();
}
public class Toko {
	//method which accepts the object of interface Informasi
	public void detailInformasi(Informasi i) {
		System.out.println(i.detail() +"\nCabang Toko Ke-1");
	}
	public static void main(String args[]) {
		//Instantiating the class
		Toko tk=new Toko();
		//Passing an anonymous inner class as an argument
		tk.detailInformasi(new Informasi() {
			public String detail() {
				return "=== INFO TOKO === \nNama Toko: Ika N Elec \nAlamat Toko: Bandung";
			}
		});
	}
}