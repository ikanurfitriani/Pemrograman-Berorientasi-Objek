class AirKelas {
	//instance method of the airkelas class
	void hewanMethod() {
		String habitat="air";
		String bernafas="paru-paru";
		String makan="ikan kecil";
		//method-local lumbalumba class
		class MethodLumbaLumba {
			public void info() {
				System.out.println("===== LUMBA-LUMBA =====\nHidup di "+habitat+
				"\nBernafas dengan "+bernafas+"\nHewan pemakan "+makan);
			}
		} //end of lumbalumba class
		//Accessing the lumbalumba class
		MethodLumbaLumba lumba=new MethodLumbaLumba();
		lumba.info();
	}
}
public class Hewan2 {
	public static void main(String args[]) {
		AirKelas air = new AirKelas();
		air.hewanMethod();
	}
}