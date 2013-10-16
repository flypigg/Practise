import  java.io.*;
public class io {
	public static void main(String[] args) throws IOException{
		int count; byte b[]=new byte[256];
		String str;
		DataInputStream din=new DataInputStream(System.in);
		BufferedInputStream in=new BufferedInputStream(din);
		try {
			if (in.markSupported()) {
				System.out.println("mark");
				System.out.print("Input the data: ");
				in.mark(256);
				count=in.read(b);
				System.out.println("The count of date: "+count);
				str=new String(b,0,count);
				System.out.println("The data input: "+str);
				in.reset();
				in.read(b,0,2);
				// System.out.println(in.available());
				str=new String(b,0,2);
				System.out.println("The first two data: "+str);
				in.reset();
				in.skip(count/2);
				in.read(b,0,count/2);
				str=new String(b,0,count/2);
				System.out.println("The half of the date: "+str);
				System.out.println(in.available());
				System.in.read();
			}
			else {
				System.out.println("Not support");
			}
			din.close(); in.close();
		}
		catch (IOException e) {
			System.out.println("Error");

		}	

	}
}