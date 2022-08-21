abstract class Hewan {
	protected String nama;
	abstract public String deskripsi(); //metode deskripsi() abstrak,
								   		//tidak ada tubuh(definisi) fungsi-nya
								   		//tapi ini diperlukan utk inheritance
	public void tampil() {
		System.out.println("===== INFORMASI =====");
		System.out.println(nama);
		System.out.println(deskripsi());
		System.out.println();
	}
}
class Serigala extends Hewan {
	private String habitat;
	private String makan;
	private int jmlhKaki;
	public Serigala(String h, String m, int k) {
		nama="Serigala";
		this.habitat=h;
		this.makan=m;
		this.jmlhKaki=k;
	}
	public String deskripsi() {
		return("Hidup di: "+this.habitat+"\nHewan pemakan: "+
		this.makan+"\nMemiliki: "+this.jmlhKaki+" kaki");
	}
}
class LumbaLumba extends Hewan {
	private String habitat;
	private String bernafas;
	public LumbaLumba(String h1, String b) {
		nama="Lumba-Lumba";
		this.habitat=h1;
		this.bernafas=b;
	}
	public String deskripsi() {
		return("Hidup di: "+this.habitat+"\nBernafas dengan: "+
		this.bernafas);
	}
}
public class Utama {
	public static void main(String[] args) {
		//Hewan h=new Hewan(); 	//Hewan abstract, tdk bisa dibuat instan
		//h.tampil(); 			//shg, pernyataan ini tdk diizinkan
		Serigala sr=new Serigala("darat", "daging", 4); //Serigala bukan abstrak
														//bisa dibuat instan
		sr.tampil();

		LumbaLumba ll=new LumbaLumba("air", "paru-paru"); //LumbaLumba bukan abstrak
														  //bisa dibuat instan
		ll.tampil();
	}
}