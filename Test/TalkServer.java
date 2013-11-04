import java.io.*;
import java.net.*;

public class TalkServer {
	public static void main(String[] args) {

		InputStream in = null;
		OutputStream out = null;
		try{
			ServerSocket ss = new ServerSocket(3333);
			while (true) {
				Socket s = ss.accept();
				in = s.getInputStream();
				out = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out );
				DataInputStream dis = new DataInputStream(in );
				String s1 = null;		String s2 = null;
				s1 = dis.readUTF();
				if (s1=="bye") {
					System.out.println(s1);
					break;
				}
				System.out.println(s1);
				BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
				s2 = keyin.readLine();
				dos.writeUTF(s2);

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