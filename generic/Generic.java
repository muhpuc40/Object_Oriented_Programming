
package generic;

class Test<G,U>
{
    G obj1;
    U obj2;
    Test(G obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
        
public class Generic{
    public static void main(String[] args)
    {
        Test<String,Integer>obj = new Test<String, Integer>("Hassan", 2211);
        obj.print();
    }
    
}
