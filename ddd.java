import java.util.*;
import java.io.*;
public class ddd{
	public static void main(String[] args) throws IOException{
		Scanner s=new Scanner(System.in);
		int a,b,m;
		System.out.println("Input a data:");
		a=s.nextInt();
		System.out.println("Again:");
		b=s.nextInt();
		deff dd=new deff();
		m=dd.def(a,b);
		int n=a*b/m;
		System.out.println("Min:"+m);
		System.out.println("Max:"+n);
		System.in.read();
	}
}
class deff{
	public int def(int x,int y){
		int t;
		if (x<y) {
			t=x;
			x=y;
			y=t;
		}
		while (y!=0) {
			if (x==y) {
				return x;
			}
			else {
				int k=x%y;
				x=y;
				y=k;
			}
		}
		return x;
	}
}