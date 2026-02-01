class Node
{
int data;
Node next;
Node(int data)
{
this.data=data;
}
}
class Sort
{
Node head;
void add(int data)
{
Node newnode=new Node(data);
if(head==null)
{
head=newnode;
}
else
{
Node currnode=head;
while(currnode.next!=null)
{
currnode=currnode.next;
}
currnode.next=newnode;
}
}
void show()
{
if(head==null)
{
System.out.println("empty");
}
else
{ 
Node currnode=head;
while(currnode!=null)
{
System.out.print(currnode.data+"-->>");
currnode=currnode.next;
}
}
}
void sorting()
{
if(head==null)
{
System.out.println("empty");
}
boolean swapped=true;
while(swapped)
{
swapped=false;
Node currnode=head;
while(currnode.next!=null){
if(currnode.data>currnode.next.data)
{
int t=currnode.data;
currnode.data=currnode.next.data;
currnode.next.data=t;
swapped=true;
}
currnode=currnode.next;
}
}
}
}
public class Bubble
{
public static void main(String[] args)
{
Sort s=new Sort();
System.out.println("before sorting");
s.add(40);
s.add(10);
s.add(5);
s.add(20);
s.show();
System.out.println("after sorting");
s.sorting();
s.show();
}
}
