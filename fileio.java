import java.io.*;
public class fileio {
	public static void main(String[] args) {
		char c; int c1; int i=0;
		File filepath=new File("temp");
		if(!filepath.exists()) filepath.mkdir();
		File f1=new File(filepath,"q.txt");
		try{
			FileOutputStream fout=new FileOutputStream(f1);
			System.out.println("Input the data,Press # to stop.");
			while((c=(char)System.in.read())!='#') fout.write(c);
			fout.close();
			System.out.println("print the data");
			FileInputStream fin=new FileInputStream(f1);
			while((c1=fin.read())!=-1&&i<5) 
			{
				System.out.println((char)c1);
				i++;
			}
			fin.close();
		}
		catch (FileNotFoundException e) {
			System.err.println(e);
		}
		catch (IOException e) {
			System.err.println(e);
		}
	}
}