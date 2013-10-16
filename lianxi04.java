import java.util.*;
import java.io.*;
public class lianxi04{
  public static void main(String[] args) throws IOException{
    Scanner s=new Scanner(System.in);
    System.out.println("Input a data");
    int a=s.nextInt();
    int k=2;
    System.out.print(a+"=");
    while (a>=k) {
      if (a==k) {
        System.out.println(k); break;
      }
      else if (a%k==0) {
        System.out.print(k+"*");a=a/k;
      }
      else {
        k++;
      }
    }
    System.in.read();
  }
}