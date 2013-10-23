public class InsertSort {
	public void sort(int a[]){
		for (int j=1;j<a.length ;j++ ) {
			int key=a[j];
			int i=j-1;
			while (i>=0&&a[i]>key) {
				a[i+1]=a[i];
				i=i-1;
				a[i+1]=key;
			}
		}
	}
	public static void main(String[] args) {
		int a[]={5,2,4,6,1,3};
		InsertSort s=new InsertSort();
		s.sort(a);
		for (int i=0;i<a.length ;i++ ) {
			System.out.println(a[i]);
		}
	}
}