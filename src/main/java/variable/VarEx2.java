package variable;
/*
 두 변수의 값을 교환할때는 하나의 변수를 추가한뒤 옮겨가며 교환 할 수 있다.
 */
public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y =20;
        int tmp = 0;

        System.out.println("x:" +x + " y:"+ y);
        tmp = x;
        x= y;
        y = tmp;
        System.out.println("x:" +x + " y:"+ y);

    }

}
