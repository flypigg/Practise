import java.io.*;
public class filerandom {
	public static void main(String[] args) {
		int num,a;
		long fp;
		try{
			InputStreamReader din=new InputStreamReader(System.in);
			BufferedReader in=new BufferedReader(din);
			RandomAccessFile rf=new RandomAccessFile(args[0],"rw");
			System.out.println("Input Five Number");
			int b[]=new int [5];
			for (int i=0; i<5; i++) {
				System.out.print("The"+(i+1)+"Number ");
				b[i]=Integer.parseInt(in.readLine());
				rf.writeInt(b[i]);
			}
			while (true) {
				fp=0;
				rf.seek(0);
				System.out.print("Input the Number ");
				num=Integer.parseInt(in.readLine());
				num=num-1;
				fp=(num)*4;
				rf.seek(fp);
				a=rf.readInt();
				System.out.println("The "+(num+1)+" Number is: "+a);
				System.out.print("Change The Data? ");
				b[num]=Integer.parseInt(in.readLine());
				fp=num*4;rf.seek(fp);
				rf.writeInt(b[num]);
				System.out.println("Continue?");
				if ((in.readLine()).equals("n")) {
					break;
				}
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}