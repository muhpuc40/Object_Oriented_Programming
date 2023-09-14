
package overloading_constructor;
public class Teacher {
String name,gender;
int phone;

Teacher()
{
    System.out.println(" NO inormation\n\n");
}


Teacher(String n, String g)
{
   name = n;
   gender = g;
    System.out.println("\n");
   
}
Teacher(String n,String g, int p)
{
    name = n;
    gender = g;
    phone = p;
     System.out.println("\n");
    
}


void displayinformation()
{
    System.out.println("NAme :"+name);
    System.out.println("GEnder :"+gender);
    System.out.println("PHone :"+phone);
}


}

