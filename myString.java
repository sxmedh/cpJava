public class myString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str);
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        String str1 = "Hello";
        int length = str1.length();
        System.out.println(length);

        // splitting string in depending on a particular charachter
        String fruits = "apple,banana,grape";
        String[] parts = fruits.split(",");
        for (String it : parts) {
            System.out.println(it);
        }
        // apple
        // banana
        // grape
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            System.out.print(' ');
        }
    }
}
