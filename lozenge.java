import java.io.*;
import java.util.*;
public class Lozenge {
	public static void main(String[] args) throws IOException{
		System.out.println("Input a data");
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		Shape ss=new Shape(n);
		ss.draw();
		System.in.read();
	}
}

class Shape{
	int n;
	public Shape(int n){
		this.n=n;
	}
	public void draw(){
		for (int i=1; i<=n; i++) {
			if (i<=n/2) {
				for (int j=0; j<=n/2-i; j++) {
					System.out.print(" ");
				}
				for (int k=1; k<=i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else {
				for (int j=1; j<i-n/2; j++) {
					System.out.print(" ");
				}
				for (int k=0; k<=n-i;k++ ) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}