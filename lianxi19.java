import java.util.*;
import java.io.*;
public class lianxi19 {
	public static void main(String[] args) throws IOException{
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Input a data:");
		n=s.nextInt();
		for (int i=0;i<n ;i++ ) {
			if (i<=2/n) {
				for (int j=0;j<n-i ;j++ ) {
				System.out.print(" ");
				}
				for (int k=0;k<=i ;k++ ) {
				System.out.print("*");
				
				}
				System.out.println();
			}
			else {
				for (int j=0;j<i ;j++ ) {
					System.out.print(" ");
				}
				for (int k=0;k<=n-i ;k++ ) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
		System.in.read();
	}
}