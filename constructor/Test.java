
package constructor;


public class Test {
    public static void main(String[] args) {
      
         
        Teacher teacher1  = new Teacher("minhaj","male",33445);
        teacher1.displayinformation();

        Teacher teacher2  = new Teacher("minhaj","male",33445);
        teacher2.displayinformation();
        
        Teacher teacher3  = new Teacher();
        teacher3.displayinformation();
                
    }
}
