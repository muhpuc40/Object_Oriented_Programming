
package javaCollection;

import java.util.ArrayList;

class Arraylist {
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<>();
        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayList 1 : " + animals);
        
        animals.add(2,"Camel");
        System.out.println("ArrayList 2 : " + animals);
        
        animals.remove(1);
        System.out.println("ArrayList 3 : " + animals);
        
        
       
    }
}
