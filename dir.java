import java.io.*;
import java.util.*;
public class dir {
	public static void main(String[] args) {
			File ListFile[];
	long totalSize=0;
	int FileCount=0,DirectoryCount=0;
	if (args.length!=1) {
		System.out.println("java dir <Path>");
		return ;
	}
	File f=new File(args[0]);
	System.out.println("Path:"+f.getParent()+" ");
	if (f.exists()!=true) {
		System.out.println(f.getPath()+"Not Exists");
		return ;
	}
	if (f.isDirectory()) {
		ListFile=f.listFiles();
		for (int i=0;i<ListFile.length ;i++ ) {
			System.out.print(ListFile[i].getName()+"\t");
			System.out.print(new Date(ListFile[i].lastModified())+"\t");
			System.out.println(ListFile[i].length()+"\t");
			if (ListFile[i].isFile()) {
				FileCount++;
			}
			else {
				DirectoryCount++;
			}
			totalSize=totalSize+ListFile[i].length();
		}
		System.out.println("Directory:"+DirectoryCount);
		System.out.println("FileCount:"+FileCount);
		System.out.println("TotalSize:"+totalSize);
	}
	else {
		System.out.print(f.getName()+"\t");
		System.out.print(new Date(f.lastModified())+"\t");
		System.out.println(f.length()+"\t");
		FileCount++;
		totalSize=totalSize+f.length();
		System.out.println("Directory:"+DirectoryCount);
		System.out.println("FileCount:"+FileCount);
		System.out.println("TotalSize:"+totalSize);
	}
	}
}