import java.io.*;
public class filedio {
	public static void main(String[] args) throws IOException{
		boolean lo=true; short si=-32768;
		int i=65534; long l=134567;
		float f=(float)1.4567; double d=3.14159265359;
		String str1="ABCD"; String str2="Java 语言";
		try{
			FileOutputStream fout=new FileOutputStream("t.txt");
			DataOutputStream out=new DataOutputStream(fout);
			FileInputStream fin=new FileInputStream("t.txt");
			DataInputStream in=new DataInputStream(fin);
			out.writeBoolean(lo); out.writeShort(si);
			out.writeByte(i); out.writeInt(i);
			out.writeLong(l); out.writeFloat(f);
			out.writeDouble(d); out.writeBytes(str1);
			out.close();
			System.out.println("Boolean lo="+in.readBoolean());
			System.out.println("Short si="+in.readShort());
			System.out.println("Byte i="+in.readByte());
			System.out.println("Int i="+in.readInt());
			System.out.println("Long l="+in.readLong());
			System.out.println("Float f="+in.readFloat());
			System.out.println("Double d="+in.readDouble());
			byte b[]=new byte[4];
			in.readFully(b);
			System.out.print("str1=");
			for (int j=0; j<4; j++) {
				System.out.print((char)b[j]);
			}
			System.out.println();
			// System.out.println("str="+in.readUTF());
			in.close();
			System.in.read();
		}
		catch (IOException e) {
			System.out.println(e.toString());
			System.in.read();
		}
	}
}