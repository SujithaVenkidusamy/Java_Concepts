import java.util.*;
public class Person
{
    String name;
    int age;
    
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("Name :" +name);
        System.out.println("Age :" +age);
    }
    public static void main(String [] args){
       
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        int age=s.nextInt();
        Person p=new Person(name,age);
        p.display();
    }
}
