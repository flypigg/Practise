import java.util.*;
public  class th extends Thread  {
	int pauseTime;
	String name;
	public th (int hTime,String hstr){
		pauseTime=hTime;
		name=hstr;
	}
	public void run(){
		Calendar now;
		int year,month,date,hour,minute,second;
		for (int i=1; i<10; i++) {
			try{
				now=Calendar.getInstance();
				year=now.get(Calendar.YEAR);
				month=now.get(Calendar.MONTH)+1;
				date=now.get(Calendar.DATE );
				hour=now.get(Calendar.HOUR_OF_DAY);
				minute=now.get(Calendar.MINUTE);
				second=now.get(Calendar.SECOND);
				System.out.println(" "+name+"Time:"+year+"year"
					+month+"month"+date+"date"+hour+"hour"+minute
					+"minute"+second+"second");
				Thread.sleep(pauseTime);

			}
			catch (Exception e) {
				System.out.println("Error:"+e);
			}
			
		}
	}
	public static void main(String[] args) {
		th Thread1=new th(2000,"Thread1");
		Thread1.start();
		th Thread2=new th(1000,"Thread2");
		Thread2.start();
	}
}
	