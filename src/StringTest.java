public class StringTest {
    public static void main(String[] args) {
        String a = "Hello world";
        String b = "Hello world";
        String c = new String("Hello world");

        System.out.println("a==b " + (a == b));
        System.out.println("a equals b " + a.equals(b));

        System.out.println("a==c :" +(a == c));
        System.out.println("a equals c " + a.equals(c));
    }
}
