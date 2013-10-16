import java.io.*;
public class ss {
	public static void main(String[] args) throws IOException {
		int count;
		byte a[]=new byte[256];
		String str;
		BufferedInputStream in=new BufferedInputStream(System.in);
			System.out.println("Input The data: ");
			count=in.read(a);
			str=new String(a,0,count);
			System.out.println(str);
			System.in.read();
			
			
			
		
		
	}
}