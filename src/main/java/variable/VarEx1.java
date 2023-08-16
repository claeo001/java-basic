package variable;
/* 변하는 수 : 변수
    변수 타입과 변수이름 지정
    타입은 알맞은 타입으로 이름은 구별될 수 있게
   변수는 초기화를 해줘야 한다 (대입 연산자 사용"=")
 */
public class VarEx1 {
    public static void main(String[] args) {
        int year = 0;
        int age = 14;

        year = age + 2000;
        age = age + 1;
        System.out.println(year);
        System.out.println(age);
    }
}
