import java.io.*;
import java.util.*;
public class Triangle {
	public static void main(String[] args) throws IOException{
		Scanner s=new Scanner(System.in);
		System.out.println("Input a data:");
		int n=s.nextInt();
		Shape triangle=new Shape(n);
		triangle.draw();
		System.in.read();
	}
}

class Shape{
	int n;
	public Shape(int n){
		this.n=n;
	}
	public void draw(){
		for (int i=0; i<n; i++) {
			for (int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}