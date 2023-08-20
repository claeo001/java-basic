package operator;

public class OpeEx2 {
    public static void main(String[] args) {
        int i =5, j = 0;
        j = i++;
        System.out.println("j=i++; 실행 후," + i + ", j =" + j);

        i = 5;
        j = 0;
        j = ++i;
        System.out.println("j=++i; 실행 후," + i + ", j =" + j);

    }
}
