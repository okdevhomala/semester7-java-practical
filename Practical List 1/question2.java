//interface Animal {
//    // 1. Abstract method
//    void makeSound();
//
//    // 2. Constant (implicitly public static final)
//    int LEGS = 4;
//
//    // 3. Default method
//    default void sleep() {
//        System.out.println("Animal is sleeping...");
//    }
//
//    // 4. Static method
//    static void info() {
//        System.out.println("Animals are living beings.");
//    }
//}
//
//// 5. Another interface to show multiple inheritance
//interface Pet {
//    void play();
//}
//
//// Dog class implements both interfaces
//class Dog implements Animal, Pet {
//    public void makeSound() {
//        System.out.println("Cat says: Meow!");
//    }
//
//    public void play() {
//        System.out.println("Cat is playing game.");
//    }
//}
//
//// Main class to run the program
//public class question2 { // Name this InterfaceExample/InterfaceDemo instead
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        System.out.println("Aayush Chandra Pradhan");
//
//        d.makeSound();             // Abstract method
//        d.play();                  // Multiple inheritance
//        d.sleep();                 // Default method
//        Animal.info();             // Static method
//        System.out.println("Cat has " + Animal.LEGS + " legs.");  // Constant
//    }
//}
