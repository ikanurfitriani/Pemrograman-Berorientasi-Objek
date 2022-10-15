package elektronik;
public class Laptop {
	private String Merk;
	private String Tipe;

	public Laptop(String Merk, String Tipe) {
		this.Merk = Merk;
		this.Tipe = Tipe;
	}
	public void informasi() {
		System.out.println("Merk Laptop adalah "+Merk);
		System.out.println("Tipe Laptop adalah "+Tipe);
		System.out.println();
	}
}