import java.io.*;
import java.util.*;
public class aa {
  public static void main(String[] args) throws IOException{
    Scanner s=new Scanner(System.in);
    
    System.out.println("Input length:");
    int length=s.nextInt();
    int[] a=new int[length];
    for (int i=0;i<length ;i++ ) {
      System.out.println("Input the data:");
      a[i]=s.nextInt();
    }
    so ss=new so();
    ss.Sort(a);
    System.out.println("Print the datas:");
    for (int i=0;i<a.length ;i++  ) {
      System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.println("Input the data you want to find:");
    int key=s.nextInt();
    mid mm=new mid();
    int m=mm.MidSearch(a,key);
    if (m==-1) {
      System.out.println("No that number");
    }
    else {
      System.out.println(m);
    }
    System.in.read();
  }

  
}
 class mid{
    public  int MidSearch(int[] a,int key){
    int low=0;  int high=a.length;
    int mid=(low+high)/2;
    while (low<=high&&key!=a[mid]) {
      if (key>a[mid]) {
        low=mid+1;
        mid=(low+high)/2;
      }
      else if (key<a[mid]) {
        high=mid-1;
        mid=(low+high)/2;
      }
      
    }
    if (low>high) {
      mid=-1;
    }
    return mid;
  }
}
 class so{
  public  void Sort(int[] a){
    int temp=0;
    for (int i=0;i<a.length ;i++ ) {
      for (int j=i+1;j<a.length ;j++ ) {
        if (a[i]>a[j]) {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
  }
}
