import java.util.*;
public class Hierarical_Inheritance{
    public static void main(String args[]){
        b s=new b();
         s.print();
        s.display();
        c h=new c();
       
         h.show();
    }
}
class a{
    public void print(){
        System.out.println("Hello Chaithra");
    }
}
class b extends a{
    public void display(){
        System.out.println("How are you");
    }
}
class c extends a{
    public void show(){
        System.out.println("I am fine");
    }
}