class List {
	String name;
	Node head;
	Node tail;
	public List(String name){
		this.name=name;
		head=null;
		tail=null;
	}
	public List(){
		this.name="List"
		head=null;
		tail=null;
	}
	public void appendToFront(Node n){
		if (head=null) {
			head=n;
		}
		else {
			n.next=head;
			head=n;
		}
	}
	public void appendToTail(Node n){
		if (head=null) {
			head=n;
		}
		else {
			tail.next=n;
			tail=n;
		}
	}
	public void visitAllNode(){
		Node p=head;
		if (p!=null) {
			System.out.println(p.num.toString()+" "+p.name.toString()+" "+p.score.toString()+"->");
			p=p.next;
		}
		else {
			System.out.println("Empty List");
		}
	}
	public Node getNode(int i){
		Node p=head;
		
			for (int j=1;j<i ;j++ ) {
				p=p.next;
				if (p==null) {
					break;
				}
			}
			if (j==i) {
				return p
			}
			else {
				System.out.println("There is not the data");
				return null;
			}
	}
	public Node getNode(Object obj,int i){
		if (i==1||i==2||i==3) {
			while (p!=null) {
				if (i==1) {
					if (p.num.equals(obj)) {
						break;
					}
				}
				if (i==2) {
					if (p.name.equals(obj)) {
						break;
					}
				}
				if (i==3) {
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
			System.out.println("There is not the data");
		}
		return p;
	}
	public Node getPreNode(Node n){
		Node p=head;	Node pre=null;
		if (p==null||p.next==null) {
			System.out.println("There is not the data");
			return null;
		}
		else {
			while (p!=n) {
				if (p==null) {
					break;
				}
				pre=p;
				p=p.next;
			}
			if (p==n) {
				return pre;
			}
			else {
				System.out.println("There is not the data");
			}
		}
	}
}