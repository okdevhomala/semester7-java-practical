//// 1. Extending Thread class
//class HelloThread extends Thread {
//    public void run() {
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Hello from HelloThread");
//        }
//    }
//}
//
//// 2. Implementing Runnable interface
//class WorldRunnable implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("World from WorldRunnable");
//        }
//    }
//}
//
//// Main class
//public class question3 {
//    public static void main(String[] args) {
//        // Using Thread class
//        HelloThread t1 = new HelloThread();
//
//        // Using Runnable interface
//        WorldRunnable runnable = new WorldRunnable();
//        Thread t2 = new Thread(runnable); // Pass runnable to Thread
//
//        // Start both threads
//        t2.start();
//        t1.start();
//
//
//        // Main thread message
//        System.out.println("Aayush Chandra Pradhan");
//    }
//}
