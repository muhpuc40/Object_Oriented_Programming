
package runnable_interface;

public class MultiprogrammingDemo {

    public static void main(String[] args) {
        
        
        // Create two Runnable objects
        Runnable program1 = new Program1();
        Runnable program2 = new Program2();

        
        // Create two threads and start them
        Thread thread1 = new Thread(program1);
        Thread thread2 = new Thread(program2);
        thread1.start();
        thread2.start();
    }

    // A sample program that implements the Runnable interface
    static class Program1 implements Runnable {
        @Override
        public void run() {
            System.out.println("Program 1 is running");
        }
    }

    // Another sample program that implements the Runnable interface
    static class Program2 implements Runnable {
        @Override
        public void run() {
            System.out.println("Program 2 is running");
        }
    }
}
