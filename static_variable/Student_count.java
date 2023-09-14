
package static_variable;

public class Student_count {
    
    static int count = 0;
    Student_count(){
            count++;
            
    }
    
void totalstudent(){
    System.out.println("Total student : "+count);
    }
}
