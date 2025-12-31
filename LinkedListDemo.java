class Node
{
int data;
Node next;
Node(int data)
{
this.data=data;
}
}
class SLL
{
Node head;
void addFirst(int data)
{
Node newNode=new Node(data);
if(head==null)
{
head=newNode;
}
else
{
newNode.next=head;
head=newNode;
}
}
void addLast(int data)
{
Node newNode=new Node(data);
if(head==null)
{
head=newNode;
}
else
{
Node current=head;
while(current.next!=null){
current=current.next;
}
current.next=newNode;
}
}
void show()
{
Node current=head;
while(current!=null)
{
System.out.print(current.data+"->");
current=current.next;
}
}
}
class LinkedListDemo
{
public static void main(String[] args)
{
SLL s1=new SLL();
s1.addFirst(10);
s1.addFirst(20);
s1.addFirst(30);
s1.addLast(40);
s1.show();
}
}