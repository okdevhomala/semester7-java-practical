//class Counter {
//    private int count = 0;
//
//    // Synchronized method - whole method is locked
//    public synchronized void increment() {
//        count++;
//        System.out.println("Synchronized Method: Count = " + count);
//    }
//
//    // Synchronized block - only this block is locked
//    public void decrement() {
//        synchronized(this) {
//            count--;
//            System.out.println("Synchronized Block: Count = " + count);
//        }
//    }
//
//    public int getCount() {
//        return count;
//    }
//}
//
//class MyThread extends Thread {
//    private Counter counter;
//    private boolean increment;
//
//    public MyThread(Counter counter, boolean increment) {
//        this.counter = counter;
//        this.increment = increment;
//    }
//
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            if (increment) {
//                counter.increment(); // synchronized method
//            } else {
//                counter.decrement(); // synchronized block
//            }
//
//            try {
//                Thread.sleep(100); // sleep to simulate delay
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//public class question5 { // Rename to SyncDemo or sth
//    public static void main(String[] args) {
//        Counter counter = new Counter();
//
//        // Thread to increment count
//        MyThread t1 = new MyThread(counter, true);
//
//        // Thread to decrement count
//        MyThread t2 = new MyThread(counter, false);
//
//        t1.start();
//        t2.start();
//
//        System.out.println("Aayush Chandra Pradhan");
//    }
//}
