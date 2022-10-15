package elektronik;
public class Smartphone {
	private String Merk;
	private String Tipe;

	public Smartphone(String Merk, String Tipe) {
		this.Merk = Merk;
		this.Tipe = Tipe;
	}
	public void informasi() {
		System.out.println("Merk Smartphone adalah "+Merk);
		System.out.println("Tipe Smartphone adalah "+Tipe);
		System.out.println();
	}
}