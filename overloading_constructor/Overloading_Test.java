
package overloading_constructor;


public class Overloading_Test 
{
 public static void main(String[] args)
 {
   Teacher teacher1 = new Teacher();
   Teacher teacher2 = new Teacher("HASSAN", "male");
   teacher2.displayinformation();
   
   Teacher teacher3 = new Teacher("Tasdik","f",6567);
   teacher3.displayinformation();
 } 
}
