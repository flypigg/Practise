public class lianxi10 {
	public static void main(String[] args) {
		double h=100;	double sum=100;
		for (int i=1;i<10 ;i++ ) {
			sum=sum+h;
			h=h/2;
		}
		System.out.println(sum);
		System.out.println(h/2);
	}
}