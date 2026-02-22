import java.util.Arrays;
class Three
{
public static void main(String[] args)
{
int[] marks={12,2,3,4,22};
System.out.println("printing the elemnets");
for(int i=0;i<marks.length;i++)
{
System.out.println(marks[i]);
}
System.out.println("using toString");
System.out.println(Arrays.toString(marks));
System.out.println("after sort");
Arrays.sort(marks);
System.out.println(Arrays.toString(marks));
}
}