import java.io.*;
public class TestList{
     public static void main(String[] args) throws IOException{
          Integer n1=new Integer(1001);
          Integer n2=new Integer(1008);
          Integer n3=new Integer(1003);
          Integer n4=new Integer(1002);
          Integer n5=new Integer(1009);
          Integer n6=new Integer(1005);
          Double s1=new Double(89.0),s2=new Double(64.5),s3=new Double(90.0),
                  s4=new Double(79.0),s5=new Double(96.5),s6=new Double(80.0);
          Node node1=new Node(n1,"li1",s1),node2=new Node(n2,"li2",s2),node3=new Node(n3,"li3",s3),
               node4=new Node(n4,"li4",s4),node5=new Node(n5,"li5",s5),node6=new Node(n6,"li6",s6);
          Node t1,t2,t3,t4;
          List f1=new List("f1List");
          f1.appendToFront(node1);f1.appendToFront(node2);f1.appendToFront(node3);
          List f2=new List("f2List");
          f2.appendToTail(node4);f2.appendToTail(node5);f2.appendToTail(node6);
          f1.visitAllNode();System.out.println();
          f2.visitAllNode();System.out.println();
          t1=f1.getNode(5);t2=f2.getNode(1);
          /*if (t1!=null) {
          System.out.println(t1.num+" "+t1.name+" "+t1.score);
          }
          if (t2!=null) {
          System.out.println(t2.num+" "+t2.name+" "+t2.score);
          }*/
          t3=f1.getNode(1001,1);
          t4=f2.getNode(1001,1);
          System.out.println(t3.name);
          System.in.read();
     }
}
class Node{
     Object num,name,score;
     Node(Object obj1,Object obj2,Object obj3){

          num=obj1;name=obj2;score=obj3;
     }
     Node next;
}
class List{
     Node head,tail;
     String Lname;
     List(String str){
          Lname=str;head=null;tail=null;
     }
     List(){
          Lname="List";head=null;tail=null;
     }
     public void appendToFront(Node n){
          if (head==null) {
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
          if (p==null) {
               System.out.println("It is empty");
          }
          else {
               while (true) {
                    System.out.print(p.num.toString()+" "+p.name.toString()+" "+p.score.toString()+"->");
                    if (p.next==null) {
                         break;
                    }
                    p=p.next;
               }
          }
     }
     public Node getNode(int i){
          Node p=head;int j;
          /*int j=1;
          while (j<i) {
               if (p.next==null) {
                    break;
               }
               p=p.next;
               j++;
          }*/
          for (j=1;j<i ;j++ ) {
               if (p.next==null) {
                    break;
               }
               p=p.next;
          }

          if (j==i) {
               return p;
          }

          else {
               System.out.println("There is not the node");
               return null;
          }

     }
     public Node getNode(Object obj,int i){
          Node p=head;
          if ((i==1)||(i==2)||(i==3)) {
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
               System.out.println("There is not the node");
          }
          return p;
     }
     public Node getPreNode(Node n){
          Node p=head;Node pre=head;
          if (p==n||p==null) {
               System.out.println("There is not the data");
               return null;
          }
          else {
               while (p!=n) {
                    if (p.next==null) {
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
               return null;
          }
          }

     }
     public void insert(Node n,int i){
          Node p=getNode(i);
          if (p!=null) {
               if (p.next==null) {
                    tail=n;
                    p.next=n;
               }
               else {
                    n.next=p.next;
                    p.next=n;
               }
          }
     }
     public void insert(Node n,Object obj,int i){
          Node p=getNode(obj,i);
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
     public void delete(int i){
          Node p=getNode(i);
          Node pre;
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
                    pre.next=tail;
                    tail=pre;
               }
               else {
                    pre.next=p.next;
               }
          }
     }
     public void delete(Object obj,int i){
          Node p=getNode(obj,i);Node pre=null;
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
}