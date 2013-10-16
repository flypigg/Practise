public class priority  {
	public static void main(String[] args) {
		Thread First=new MyThread("A");
	Thread Second=new MyThread("B");
	Thread Third=new MyThread("C");
	First.setPriority(Thread.MAX_PRIORITY);
	Second.setPriority(Thread.NORM_PRIORITY);
	Third.setPriority(Thread.MIN_PRIORITY);
	Third.start();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      z
	Second.start();
	First.start();
	}

}
class MyThread extends Thread  {
	String message;
	public MyThread(String message){
		this.message=message;
	}
	public void run(){
		for (int i=0;i<2 ;i++ ) {
			System.out.println(message+" "+getPriority());
		}

	}
}