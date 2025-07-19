import java.io.*;

// 1. Create a class that implements Serializable
class Student implements Serializable {
    int id;
    String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class question7 { // rename to FileSerializationExample
    public static void main(String[] args) {
        // Object to write
        Student s1 = new Student(101, "Khusboo Karki");

        // 2. Write object to file
        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);  // Serialize object
            oos.close();
            fos.close();

            System.out.println("Object written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. Read object from file
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();  // Deserialize
            ois.close();
            fis.close();

            System.out.println("Object read from file:");
            s2.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
