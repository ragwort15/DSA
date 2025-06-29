class LinkedList{
 class Node{
 int data;
 Node next;
 Node(int data){
 this.data=data;
  next=null;
}
}
Node head=null;
public void add(int data){

Node newNode=new Node(data);

if(head==null){
head=newNode;
return;
}
Node current=head;
while(current.next!=null){
current=current.next;

}
current.next=newNode;
}