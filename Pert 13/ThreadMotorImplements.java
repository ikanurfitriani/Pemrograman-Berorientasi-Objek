class Motor implements Runnable {
	private Thread t;
    private String nama;

    public Motor(String id) { // konstruktor
		nama = id;
		System.out.println(nama + " Ready!");
    }
    public void run() {
		for (int i = 5; i > 0; i--) {
			try {
				Thread.sleep((int)(Math.random() * 5000));
            } catch (InterruptedException ie) {
                System.out.println("Terinterupsi");
            }
            System.out.println(nama + ": Posisi " + i);
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
public class ThreadMotorImplements {
	public static void main(String[] args) {
		Motor mtr1 = new Motor("Motor Marquez");
		mtr1.start();
        Motor mtr2 = new Motor("Motor Rossi");
        mtr2.start();
    }
}