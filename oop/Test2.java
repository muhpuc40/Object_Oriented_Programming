package oop;

public class Test2 {
        
    public static void main(String[] args) 
    {
        Oop teacher1  = new Oop(); //object declare and create
        
        teacher1.name = "Minhaj Uddin Hassan";
        teacher1.gender = "Male";
        teacher1.phone = 73025;
                
        System.out.println("Name : "+teacher1.name);
        System.out.println("Gender : "+teacher1.gender);
        System.out.println("phone : "+teacher1.phone);
        
                   
        
        Oop teacher2  = new Oop(); //object declare and create
        teacher2.name = "Noor uddin tasdik";
        teacher2.gender = "Male";
        teacher2.phone = 45436 ;
        
        System.out.println("Name : "+teacher2.name);
        System.out.println("Gender : "+teacher2.gender);
        System.out.println("phone : "+teacher2.phone);
    }
}
