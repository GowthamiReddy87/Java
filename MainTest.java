import library.*;
public class MainTest
{
public static void main(String[] args)
{
System.out.println("from book class");
new library.Book().displayBookInfo();
System.out.println("from member class");
new library.Member().display();
}
}

