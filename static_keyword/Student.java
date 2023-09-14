package static_keyword;
public class Student {

    String name;
    int id;
    static String varsityname="PUC";
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    void displayinformation(){
        System.out.println("Name       : "+name);
        System.out.println("roll       : "+id);
        System.out.println("University : "+varsityname);
        System.out.println("\n");
        
    }
}
