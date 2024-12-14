import java.util.*;
class a
{
    public void p1()
    {
        System.out.println("Hello Students");
    }
}
class b extends a
{
    public void r()
    {
        System.out.println("Hello Teachers");
    }
}
class c extends b
{
    public void r1()
    {
        System.out.println("Hello Professor");
    }
}
public class Multiple_Inheritance
{
    public static void main(String args[])
    {
        c h1=new c();
        h1.r();
        h1.r1();
    }
}