import java.io.*;
public class pipe {
	public static void main(String[] args) throws IOException {
		byte a1=25,a2=67;
		byte b[]={'L','O','V','E',',','J','A','V','A'};
		try{
			PipedInputStream pin=new PipedInputStream();
			PipedOutputStream pout=new PipedOutputStream(pin);
			ByteArrayInputStream bin=new ByteArrayInputStream(b);
			ByteArrayOutputStream bout =new ByteArrayOutputStream();
			System.out.println("PipedInputStream And PipedOutputStream");
			System.out.println("Put The Data a1 Send to pout");
			pout.write(a1);
			System.out.println("Put The Data a2 send to pout");
			pout.write(a2);
			System.out.println("Read the Data Form pin "+(byte)pin.read());
			System.out.println("Read the Data Form pin "+(byte)pin.read());
			int n=b.length;
			bin.skip(n/2);
			int m;
			while (bin.available()>0) {
				bout.write(bin.read());
			}
			System.out.println("Output the half data");
			// bout.writeTo(System.out);
			bin.reset(); bout.reset();
			m=b.length;
			byte rb[]=new byte[m];
			bin.read(rb,0,10);
			bout.write(rb,0,10);
			System.out.println("Output the data:"+bout.toString());	
			System.in.read();		
		}
		catch (Exception e) {
			System.out.println("Error");
		}
	}
}