
interface ResCallback{
	void onRes(String res);
}
class WorkThread extends Thread {
	private ResCallback callback;
	public WorkThread(ResCallback callback) {
		this.callback=callback;
	}
public void run() {
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	String result = "Thread result data";
	callback.onRes(result);
}
}
public class q2 {
	public static void main(String[] args) {
		ResCallback callback=result->{
			System.out.println("recieved result in main thread: "+result);
		};
		WorkThread wt = new WorkThread(callback);
		wt.start();
		try {

			wt.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main Thread continues execution");
	}
}
