//class MyThread extends Thread {
//    public void run() {
//        synchronized(this) {
//            System.out.println("Aayush Chandra Pradhan");
//            System.out.println(getName() + " started");
//
//            try {
//                System.out.println(getName() + " sleeping...");
//                Thread.sleep(1000); // sleep()
//
//                System.out.println(getName() + " yielding...");
//                Thread.yield(); // yield()
//
//                System.out.println(getName() + " waiting...");
//                wait(); // wait()
//            } catch (InterruptedException e) {
//                System.out.println(getName() + " interrupted");
//            }
//
//            System.out.println(getName() + " resumed after notify");
//        }
//    }
//}
//
//public class question4 { // name as ThreadDemo or similar while writing in copy
//    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        t1.setName("Thread-1");
//        t1.start();
//
//        try {
//            Thread.sleep(2000); // Ensure t1 starts and waits
//        } catch (InterruptedException e) {}
//
//        synchronized(t1) {
//            System.out.println("Main thread notifying...");
//            t1.notify(); // notify()
//        }
//
//        // Unsafe stop (for demo only)
//        MyThread t2 = new MyThread();
//        t2.setName("Thread-2");
//        t2.start();
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {}
//        System.out.println("Main thread stopping Thread-2 (unsafe)");
//        t2.stop(); // Deprecated
//    }
//}
