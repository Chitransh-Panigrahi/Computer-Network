
class A extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Priyansu");
		}
	}
}
class B extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Panda");
		}
	}
}
public class q1 {
	public static void main(String[] args) {
		A obj = new A();
		B obj1 = new B();
		obj.start();
		obj1.start();
	}
}
