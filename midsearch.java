import java.io.*;
class search{
	int search(int a[],int searchvalue)
	{
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		while (low<high&&a[mid]!=searchvalue)
		{
			if (a[mid]<searchvalue) 
			{
				low=mid+1;
			}
			else 
			{
				high=mid-1;
			}
			mid=(high+low)/2;
			if (low>high)
			{
				mid=-1;
			}
		
			
		}
	return mid;
	}
}
public class midsearch {
	public static void main(String[] args) throws IOException {
		BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
		int search,mid;
		String c1;
		int a[]={2,3,5,6,7,8,9,12,34,667};
		System.out.println("Output the data");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+"\t");
		}
		System.out.println();
		System.out.println("Input the data You want to search:");
		c1=keyin.readLine();
		search=Integer.parseInt(c1);
		search ff=new search();
		mid=ff.search(a, search);
		if (mid==-1) System.out.println("There's not the data");
		else System.out.println(mid);
		System.in.read();
		
		
	}
}
