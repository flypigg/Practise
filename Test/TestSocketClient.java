import java.net.*;
import java.io.*;

public class TestSocketClient {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		try{
			Socket s = new Socket("127.0.0.1", 8888);
			in = s.getInputStream();
			out = s.getOutputStream();
			DataInputStream dis = new DataInputStream(in);
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("hey");
			String s1 = null;

			if ((s1=dis.readUTF())!= null) {
				System.out.println(s1);
				dos.close();
				dis.close();
				s.close();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}
}