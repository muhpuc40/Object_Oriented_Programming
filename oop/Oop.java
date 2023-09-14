
package oop;

public class Oop {
    String name,gender;
    int phone;
    
    void Setinformation(String n, String m, int p)
    {
        name = n;
        gender = m;
        phone = p;
    }
    
   void displayinformation() //method create
    {
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("phone : "+phone);
        System.out.println("\n\n");
    }
}
