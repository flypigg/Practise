import java.io.*;
import java.util.*;
public class fff {
	public static void main(String[] args) throws IOException {
		String Path;
		InputStreamReader din=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(din);
		try{
			System.out.println("Input the Path");
			Path=in.readLine();
			File f=new File(Path);
			System.out.println("Path:"+f.getParent());
			System.out.println("name:"+f.getName());
			System.out.println("True Path:"+f.getAbsolutePath());
			System.out.println("Is it a file:"+(f.isFile()?"Yes":"No"));
			System.out.println("Is it a directory:"+(f.isDirectory()?"Yes":"No"));
			System.out.println("Is it hidden:"+(f.isHidden()?"Yes":"No"));
			System.out.println("Can it read:"+(f.canRead()?"Yes":"No"));
			System.out.println("The last time you change:"+new Date(f.lastModified()));
			System.in.read();
		}
		catch (IOException e) {
			System.out.println("Error");
		}
	}
}