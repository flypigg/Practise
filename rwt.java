import java.io.*;
public class rwt  {
	public static void main(String[] args) throws IOException{
		char c1[],c2[],temp;
		String str;
		CharArrayReader cin; CharArrayWriter cout;
		InputStreamReader sin=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(sin);
		OutputStreamWriter out=new OutputStreamWriter(System.out);
		try{
			System.out.println("Input Data:");
			str=in.readLine();
			c1=str.toCharArray();
			cin=new CharArrayReader(c1);
			cout=new CharArrayWriter();
			while (cin.ready()) {
				cout.write(cin.read());
			}
			System.out.print("c2=");
			c2=cout.toCharArray();
			System.out.println(new String(c2));
			System.out.print("CharArray Input: ");
			cout.writeTo(out);
			out.flush();
			System.in.read();
		}
		catch (IOException e) {
			System.out.println("IOException");
		}
	}
}