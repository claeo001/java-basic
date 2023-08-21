package operator;

public class OpeEx20 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.println("str2 = " + str2.equals("abc"));
        System.out.println("str1 = " + str1.equals("ABC"));
        System.out.println("str2 = " + str2.equalsIgnoreCase("ABC"));
    }
}
