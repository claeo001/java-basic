package variable;
/*
 primitive type : boolean, char, byte, short, int, long, float, double.

 */
public class VarEx7 {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch;
        System.out.printf("%c=%d(%#X)%n",ch , code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);

        /*
        tab = \t
        backspace = \b
        form feed = \f
        new line = \n
        carriage return = \r
        \\ \' \" \ "유니코드"
         */
    }
}
