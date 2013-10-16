import java.util.*;
import java.io.*;
public class lianxi07{
	public static void main(String[] args) throws IOException{
		char ch[]=null;
		int digital=0;
		int character=0;
		int blank=0;
		int other=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Input Data:");
		String str=s.nextLine();
		ch=str.toCharArray();
		for (int i=0;i<=ch.length ;i++ ) {
			if (ch[i]>='0'&&ch[i]<='9') {
				digital++;
			}
			else if (ch[i]>='a'&&ch[i]<='z') {
				character++;
			}
			else if (ch[i]==' ') {
				blank++;
			}
			else {
				other++;
			}
		}
		System.out.println(digital+" "+character+" "+blank+" "+other+" ");
		System.in.read();
	}
}