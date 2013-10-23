public class TestSync implements Runnable {
	public static void main(String[] args) throws Exception{
		TestSync test=new TestSync();
		Thread t1=new Thread(test);
		Thread t2=new Thread(test);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
		Thread.sleep(1000);
		int a=Timer.num;
		System.out.println(a);
	}
	public void run(){
		Timer.add(Thread.currentThread().getName());
	}
}
class Timer{
	public static int num=0;
	public synchronized static void add(String s){
		num++;
		try{
			Thread.sleep(100);
		}
		catch (InterruptedException e) {
			
		}
		System.out.println(s+",You are the"+num);
	}
}
