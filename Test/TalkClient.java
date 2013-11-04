import java.io.*;
import java.net.*;

public class TalkClient {
	public static void main(String[] args) {

		InputStream in = null;
		OutputStream out = null;
		try {
			Socket s = new Socket("127.0.0.1", 3333);
			while (true) {
				in = s.getInputStream();
				out = s.getOutputStream();
				DataInputStream dis = new DataInputStream(in);
				DataOutputStream dos = new DataOutputStream(out );
				String s1=null;
				BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
				s1 = keyin.readLine();
				dos.writeUTF(s1);

				String s2 = null;
				s2 = dis.readUTF();
				if (s2=="bye") {
					System.out.println(s2);
					break;
				}
				System.out.println(s2);
				dos.close();
				dis.close();
				//s.close();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}