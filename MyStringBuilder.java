public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        System.out.println(sb.toString());

        // this will add in between
        sb.insert(5, " in between ");
        System.out.println(sb.toString());

        // this will delete in between
        sb.delete(6, 18);
        System.out.println(sb.toString());

        // to reverse the string we have to apply the followinf function
        sb.reverse();
        System.out.println(sb.toString());

        int length = sb.length();
        System.out.println(length);
    }
}
