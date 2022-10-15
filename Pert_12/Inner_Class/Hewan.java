class DaratKelas {
	private String habitat="darat";
	private String makan="daging";
	private int jmlhKaki=4;
	//inner class
	public class SerigalaKelas {
		public String deskripsi() {
			return("===== SERIGALA =====\nHidup di "+habitat+
			"\nHewan pemakan "+makan+"\nMemiliki "+jmlhKaki+" kaki");
		}
	}
}
public class Hewan {
	public static void main(String args[]) {
		//Instantiating the darat kelas
		DaratKelas darat=new DaratKelas();
		//Instantiating the serigala kelas
		DaratKelas.SerigalaKelas serigala=darat.new SerigalaKelas();
		System.out.println(serigala.deskripsi());
	}
}