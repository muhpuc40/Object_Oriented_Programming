package constructor;
public class Teacher {
    
String name,gender;
int phone;
//constructor
Teacher()
{
    System.out.println(" EEHhhheeee deafault ");
}

    
Teacher(String a, String b, int c) //parameterize constructor
{
 name = a;
 gender = b;
 phone = c;
}

 
   void displayinformation() //method create
    {
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("phone : "+phone);
        System.out.println("\n\n");
    }
}
