import java.io.*;
public class io1 {
	public static void main(String[] args) throws IOException {
		int count;
		byte a[]=new byte[256];
		String str;
		BufferedInputStream in=new BufferedInputStream(System.in);
		DataOutputStream stdout=new DataOutputStream(System.out);
		BufferedOutputStream out=new BufferedOutputStream(stdout);
		PrintStream p=new PrintStream(System.out);
		try{
			if (in.markSupported()) {
				p.println("Mark");
				p.println("Input the data: ");
				// in.mark(256);
				count=in.read(a);
				p.println("The numbers of data: "+count);
				p.println("The String: ");
				out.write(a,0,count);
				out.flush();
				System.in.read();
			}
			else{System.out.println("Not markSupported");}
			p.close(); in.close();
			stdout.close(); out.close();
		}
		catch (IOException e) {
			System.out.println("Error");
		}
	}
}