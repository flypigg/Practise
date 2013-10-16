import  java.io.*;
class Node {
	Object name,num,score;
	Node next;
	public Node(Object obj1,Object obj2,Object obj3) {
		name=obj1;
		num=obj2;
		score=obj3;
	}
}

class List{
	Node tail,head;
	String Lname;
	public List(String str){
		Lname=str;
		head=null;
		tail=null;
	}
	public void appendToFront(Node n){
		if (head==null){
			head=n;tail=n;
		}
		else {
			n.next=head;
			head=n;
		}
	}
	public void appendToTail(Node n){
		if (head==null) {
			head=n;tail=n;
		}
		else {
			tail.next=n;
			tail=n;
		}
	}
	public void visitAllNode(){
			Node p=head;
			System.out.println(this.Lname);
			if(p==null)
			System.out.println("Empty List");
			else {
					while (true) {
						System.out.print(p.name.toString()+" "+p.num.toString()+" "+p.score.toString()+" "+"->");
						if (p.next==null) {
							break;
						}
						p=p.next;
					}
				}	
	}
	public Node getNode(int i){
		int j;Node p=head;
		for (j=1;j<i ;j++ ) {
			if (p.next==null) {
				break;
			}
			p=p.next;
		}
		if (j==i) {
			return p;
		}
		else{
			System.out.println("No Value");
			return null;
		}
		// if (p==null) {
		// 	System.out.println("No Value");
		// 	return null;
		// }
		// else {
		// 	return p;
		// }
		
			
		
	}
	public Node getNode(Object obj,int j){
		Node p=head;
		if ((j==1)||(j==2)||(j==3)) {
			while (p!=null) {
				if (j==1) {
					if (p.name.equals(obj)) {
						break;
					}
				}
				if (j==2) {
					if (p.num.equals(obj)) {
						break;
					}
				}
				if (j==3) {
					if (p.score.equals(obj)) {
						break;
					}
				}
				p=p.next;
			}

		}
		else {
				p=null;
			}
		if (p==null) {
				System.out.println("No Value");
			}
			return p;
	}
	public Node getPreNode(Node n){
		Node p=head;Node pre=head;
		if ((n==p)||(p==null)) {
			System.out.println("No Pre Node");
			return null;
		}
		else {
			while (n!=p) {
				if(p.next==null)break;
				pre=p;p=p.next;
			}
			if (n==p) {
				return pre;
			}
			else {
				System.out.println("No Pre Node");
				return null;
			}
		}
	}
	// // 	Node p=head;
	// // 	while (p!=null) {
	// // 		if (p.next==n) {
	// // 			break;
	// // 		}
	// // 		p=p.next;
	// // 	}
	// // 	if (p==null) {
	// // 		System.out.println("No Pre Node");
	// // 	}
	// // 	return p;
 
	public void insert(Node n,int i){
		Node p=getNode(i);
		if (p!=null) {
			if (p.next==null) {
				p.next=n;
				tail=n;
			}
			else {
				n.next=p.next;
				p.next=n;
			}
		}

	}
	public void insert(Node n,Object obj,int i){
		Node p=getNode( obj, i);
		if (p!=null) {
			if (p.next==n) {
				p.next=n;
				tail=n;
			}
			else {
				n.next=p.next;
				p.next=n;
			}
		}
	}
	public void delete(int i){
		Node p=getNode(i);Node pre=null;
		if (p!=null) {
			if (i==1) {
				if (p.next!=null) {
					head=p.next;
				}
				else {
					head=tail=null;
				}
			}
			else {
				pre=getPreNode(p);
				if (p.next==null) {
					pre.next=null;
					tail=pre;
				}
				else {
					pre.next=p.next;
				}
			}
		}
	}
	public void delete(Object obj,int i){
		Node p=getNode(obj,i); Node pre=null;
		if (p!=null) {
			if (p==head) {
				if (p.next!=null) {
					head=p.next;
				}
				else {
					head=tail=null;
				}
			}
			else {
				pre=getPreNode(p);
				if (p.next==null) {
					pre.next=null;
					tail=pre;
				}
				else {
					pre.next=p.next;
				}
			}
		}

	}
	public void deleteAll(){
		head=tail=null;

	}
	public void updateNode(Node n,int i){
		Node p=getNode(i);Node pre=null;
		if (p!=null) {
			if (p==head) {
				n=head;
				n.next=p.next;
			}
			else {
				pre=getPreNode(p);
				if (p==tail) {
					n=pre.next;
					tail=n;
				}
				else {
						n=pre.next;
						n.next=p.next;
				}

			}
		}
	}
	public void updateNode(int i,Object obj,int j){
		Node p=getNode(i);
		if (p==null) 
			System.out.println("There is not the Node");
		else {
				switch (j) {
					case 1:p.name=obj;break;
					case 2:p.num=obj;break;
					case 3:p.score=obj;break;
					default:
						System.out.println("Wrong");
				}
			}
		
	}
	public void updateNode(Node n,Object obj,int i){
			Node p=getNode(obj,i);Node pre=null;
		if (p!=null) {
			if (p==head) {
				n=head;
				n.next=p.next;
			}
			else {
				pre=getPreNode(p);
				n=pre.next;
				n.next=p.next;

			}
		}

	}
	public List listSort (int j)
	{
	List f2=new List("f2list");
	if (head==null) {
		return f2;
	}
	if ((j==1)||(j==2)||(j==3)) {
		System.out.println("The List name:"+Lname);
		Node pp=new Node(head.name,head.num,head.score);
		if (head.next==null) {
			System.out.println("There is only one node");
		}
		else {
			Node f1p=head.next; Node f2p=null;
			f2.appendToFront(pp);
			String st1=" ",st2=" ";int i;
			while (true) {
				Node p=new Node(f1p.name,f1p.num,f1p.score);
				f2p=f2.head;
				i=1;
				if (j==1) {
					st1=String.valueOf(p.name);
					st2=String.valueOf(f2p.name);
				}
				if (j==2) {
					st1=String.valueOf(p.num);
					st2=String.valueOf(f2p.num);
				}
				if (j==3) {
					st1=String.valueOf(p.score);
					st2=String.valueOf(f2p.score);
				}
				while ((st1.compareTo(st2)>=0)&&f2p.next!=null) {
					i++;f2p=f2p.next;
					if (j==1) {
						st2=String.valueOf(f2p.name);
					}
					if (j==2) {
						st2=String.valueOf(f2p.num);
					}
					if (j==3) {
						st2=String.valueOf(f2p.score);
					}
				}
				if ((st1.compareTo(st2))<=0) {
					if (f2.head.equals(f2p)) {
						f2.appendToFront(p);
					}
					else {
						f2.insert(p,i-1);
					}
				}
				else f2.insert(p,i);
				if(f1p.next==null) break;
				f1p=f1p.next;
			}
		}
	}
	else {
		System.out.println("no value");
	} 
	return f2;
}
}


public class c14  {
	public static void main(String[] args) throws IOException{
		String hi="KJ";Node n;
		List ll=new List(hi);
		Node n1=new Node("li",34,78);
		Node n2=new Node("xi",100,89);
		Node n3=new Node("zi",24,99);
		Node n4=new Node("kk",26,100);
		ll.appendToFront(n1);
		ll.appendToFront(n2);
		ll.appendToFront(n3);
		ll.visitAllNode();
		System.out.println();
		// ll.updateNode(2,"wwwww",1);
		ll.listSort(2);
		ll.visitAllNode();


		// hk.visitAllNode();
		// hk=ll.listSort(2);
		// hk.visitAllNode();

		// ll.listSort(2);
		// ll.visitAllNode();

		// ll.delete(2);
		// ll.visitAllNode();
		// System.out.println();
		// n=ll.getNode(2);
		// n3.next=n4;
		
		// ll.visitAllNode();
		// System.out.println(n.name);
		// ll.insert(n4,2);
		// n=ll.getPreNode(n1);
		// System.out.println(n.name);
		// System.out.println(n2.next.name);
		System.in.read(); 
		
	
   }
}
