package overloading;
class Siize {
    double n1;
    double n2;
    double n3;
 
    Siize(double x, double y, double z)
    {
        n1 = x;
        n2 = y;
        n3 = z;
    }
    
    Siize (double x, double y)
    {
        n1=x;
        n2=y;
    }
    
    Siize(Siize ob)
    {
        n1 = ob.n1;
        n2 = ob.n2;
        n3 = ob.n3;
    }
    
    void test(Siize sc)
    {
        sc.n1+=12;
        sc.n2/=6;
        sc.n3*=4;
    }
}
public class Overloading {

    public static void main(String[] args) {
        Siize ob1 = new Siize (10,24,11);
        Siize ob3 = new Siize (ob1);
        ob3.test(ob3);
        
        
       System.out.println("value number 1 (*) = "+ob3.n1);
       System.out.println("value number 2 (/) = "+ob3.n2);
       System.out.println("value number 3 (+) = "+ob3.n3);
      
    }
}