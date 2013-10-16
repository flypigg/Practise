import java.util.*;
import java.io.*;
public class aa{
  public static void main(String[] args) throws IOException{
    int a=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Input a data:");
    a=s.nextInt();
    for (int i=1;i<=a ;i++ ) {
      if (i<=a/2) {
        for (int j=0;j<=a/2-i ;j++ ) {
        System.out.print(" ");
        }
        for (int k=1;k<=i ;k++ ) {
        System.out.print("* ");
        }
        System.out.println();        
      }
      else {
        for (int j=1;j<i-a/2 ;j++ ) {
          System.out.print(" ");
        }
        for (int k=0; k<=a-i;k++ ) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
    System.in.read();
  }
}