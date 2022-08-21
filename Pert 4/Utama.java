import elektronik.*;
public class Utama {
	public static void main(String[] args) {
		Laptop la1;
		la1=new Laptop("ASUS", "VivoBook A442UQ");
		la1.informasi();

		Smartphone sm1;
		sm1=new Smartphone("Iphone", "13 Pro Max");
		sm1.informasi();
	}
}