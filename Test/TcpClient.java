import java.net.*;
import java.io.*;

public class TcpClient {
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("127.0.0.1", 3333);
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("Hello Server");
		dos.flush();
		dos.close();
		s.close();
	}
}