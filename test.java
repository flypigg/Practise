import java.io.*;
import java.util.*;
public class test {
	public static void main(String[] args) throws IOException{
		System.out.println("Input a data:");
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		for (int i=1; i<=n; i++) {
			if (i<=n/2) {
				for (int j=1; j<=n-i; j++) {
					System.out.print(" ");
				}
				for (int k=1; k<=i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else {
				for (int j=1; j<i; j++) {
					System.out.print(" ");
				}
				for (int k=0; k<=n-i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		System.in.read();

	}
}

