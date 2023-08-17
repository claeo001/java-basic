package variable;
/*
     문자 하나를 감싸면 문자리터럴이라 부르고 두 문자 이상은 문자열 리터럴이다.
     문자 리터럴은 공백이 있으면 안된다.
     문자랑 타입변수를 더하면 문자열이 된다.
 */

public class VarEx3 {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " ");
        System.out.println(" "+ 7);
        System.out.println(7 + "");
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + "");
        System.out.println(""+ 7 + 7 );
    }
}
