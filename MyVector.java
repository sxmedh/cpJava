import java.util.Vector;

public class MyVector {
    /*
     * Vectors is similar to an ArrayList, but it is synchronized, meaning that it
     * is
     * thread-safe.
     */
    public static void main(String[] args) {
        Vector<String> myVector = new Vector<String>();
        myVector.add("Apple");
        myVector.add("Banana");
        myVector.add("Orange");
        String fruit = myVector.get(0); // Gets the first element ("Apple")
        myVector.remove(1); // Removes the element at index 1 ("Banana")
        for (String item : myVector) {
            System.out.println(item);
        }
        int size = myVector.size(); // Returns the number of elements in the Vector
        boolean containsOrange = myVector.contains("Orange"); // Checks if "Orange" is present
        boolean isEmpty = myVector.isEmpty(); // Checks if the Vector is empty
        System.out.println(fruit + " " + size + " " + containsOrange + " " + isEmpty);
    }
}
