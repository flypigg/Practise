import java.util.*;
import java.io.*;
public class lianxi08  {
	public static void main(String[] args) throws IOException{
		int a=0;	int b=0;	int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Input a data:");
		a=s.nextInt();
		System.out.println("Input another data:");
		int n=s.nextInt();
		int i=0;
		while (i<n) {
			b=b+a;
			sum=sum+b;
			a=a*10;
			i++;
		}
		System.out.println(sum);
		System.in.read();
	}
}