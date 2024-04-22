import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int first = arrayList.get(0); // gets the element at index 0
        System.out.println(first);
        arrayList.remove(1); // remove element at list 1
        for (Integer i : arrayList) {
            System.out.print(i);
        }
        int size = arrayList.size();
        boolean contains = arrayList.contains(5);
        boolean isEmpty = arrayList.isEmpty();

        System.out.println(size);
        System.out.println(contains);
        System.out.println(isEmpty);

        /*
         * all of these functions are also similar for LinkedList
         * LinkedList<String> myList = new LinkedList<String>();
         */
    }
}
