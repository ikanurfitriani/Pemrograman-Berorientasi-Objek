 class Sepeda extends Thread {
	 private Thread t;
	 private String nama;

	 public Sepeda (String id) { // konstruktor
		 nama = id;
		 System.out.println(nama + " Ready!");
     }
     public void run() { // Mendefinisikan sendiri run()
         for (int i=5; i>0; i--) {
			 try {
				 Thread.sleep((int)(Math.random() * 5000));
             } catch(InterruptedException ie) {
				 System.out.println("Terinterupsi");
             }
             System.out.println(nama + ": Posisi " + i );
		 }
		 System.out.println(nama + " Finish!");
	 }
	 public void start() {
	 	System.out.println(nama + " Go!");
	 	if (t == null) {
	 		t = new Thread(this, nama);
	 		t.start();
	 	}
	}
 }
public class ThreadSepedaExtends {
	public static void main (String [] args) {
		Sepeda spd1 = new Sepeda("Sepeda Ika");
		spd1.start();
    	Sepeda spd2 = new Sepeda("Sepeda Dini");
    	spd2.start();
    }
}