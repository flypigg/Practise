import java.io.*;
public class filerw {
	public static void main(String[] args) throws IOException {
		String temp;
		File sourceFile,targetFile;
		BufferedReader source;
		BufferedWriter target;
		try{
			InputStreamReader din=new InputStreamReader(System.in);
			BufferedReader in=new BufferedReader(din);
			System.out.println("Input the sourceFile Path");
			sourceFile=new File(in.readLine());
			source=new BufferedReader(new FileReader(sourceFile));
			System.out.println("Input the targetFile Path");
			targetFile=new File(in.readLine());
			target=new BufferedWriter(new FileWriter(targetFile));
			System.out.println("Are you sure to copy?");
			if ((in.readLine()).equals("y")) {
				while ((temp=source.readLine())!=null) {
					target.write(temp);
					target.newLine();
					target.flush();
				}
				System.out.println("Completed!");
			}
			else{
				System.out.println("Failed");
				return ;
			}
			System.in.read();
			din.close();
			in.close();
			
		}
		catch (IOException e) {
			System.out.println(e);
			System.in.read();
		}
	}

}