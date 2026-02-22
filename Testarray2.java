class Testarray2
{
public static void main(String[] args)
{
int[] marks={12,23,22,99,22};
if(marks.length==0||marks==null)
{
System.out.println("empty array or null");
return;
}
for(int i=0;i<marks.length;i++)
{
System.out.println(marks[i]);
}
}
}
