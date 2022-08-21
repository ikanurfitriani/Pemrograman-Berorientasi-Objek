final class SepedaBalap {
	String infodetail() {
		return "Sepeda Balap Terbaik: Element Roadbike FRC 38";
	}
}
class SepedaLipat extends SepedaBalap {
	String infodetail() {
		return "Sepeda Lipat Terbaik: RoadBike Exotic 2708";
	}
}
public class Sepeda {
	public static void main(String[] args) {
		SepedaBalap spdblp = new SepedaBalap();
		SepedaLipat spdlpt = new SepedaLipat();
	}
}