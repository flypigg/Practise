public class test {
	public static void main(String[] args) {
		dog d1=new dog(1);
		dog d2=new dog(1);
		String s1=new String("Hello");
		String s2=new String("Hello");
		System.out.println(d1.equals(d2));
		System.out.println(s1.equals(s2));
	}
}

class dog{
	int color;
	public dog(int color){
		this.color=color;
	}
}