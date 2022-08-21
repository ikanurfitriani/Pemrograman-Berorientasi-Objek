public class Toko {
	private String namaToko;
	private String alamat;
	private Laptop lap; //bentuk komposisi dengan kelas Laptop

	public Toko() {
		this.namaToko="Ika N Cell";
		this.alamat="Kuningan";
		this.lap=new Laptop();
		lap.setMerk("Lenovo");
		lap.setTipe("IdeaPad Slim 3");
		lap.setTahun(2020);
	}
	public void cetakToko() {
		System.out.println("Nama Toko: "+this.namaToko);
		System.out.println("Alamat: "+this.alamat);
		lap.cetakLaptop();
	}
}