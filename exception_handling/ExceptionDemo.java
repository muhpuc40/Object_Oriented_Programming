
package exception_handling;


public class ExceptionDemo {
    public static void main(String[] args){
        
        
        try{
        int x=10 , y = 0;
        int result = x/y ;
        System.out.println(" Result : "+result); 
        }
        catch(ArithmeticException Xn)   //multiple exception
        {      
            System.out.println("exception : "+Xn);
        }
        catch(Exception XX) //supermos exception : said by anisul
        {
            System.out.println("exception : "+XX);
        }
        
        
        
      finally{
            System.out.println(" yyaaahhoooo");
        }
        
        
        
        
        
        
        
    }
    
}
