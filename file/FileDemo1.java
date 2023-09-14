
package file;

import java.io.File;
public class FileDemo1 {
    public static void main(String[] args){
        File dir = new File("person");
        
        dir.mkdir();  //directory will be created
       
        String path = dir.getAbsolutePath();
        
    File file1 = new File(path+" sssss.txt");
    File file2 = new File(path+" sss.txt");

    try{
        
        file1.createNewFile();
        file2.createNewFile();
        System.out.println("created");
    }  
    catch(Exception e ){
        System.out.println(e);
    }
    }
}
