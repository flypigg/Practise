import java.net.*;
import java.io.*;
public class TcpServer {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(3333); //Ö¸¶¨¶Ë¿ÚºÅ
		while (true) {
			Socket s = ss.accept();
			System.out.println("A client connect!");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			dis.close();
			s.close();
			//System.out.println("A client connect");
		}
	}
}