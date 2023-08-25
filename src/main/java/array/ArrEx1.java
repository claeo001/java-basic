package array;

import java.lang.reflect.Array;
import java.util.Scanner;

/*
    같은 타입에 여러 변수를 하나로 묶는 것을 배열이라함
    - 중요한 점은 같은 타입이어야 한다.
    선언과 생성은 위치가 상관이 없다.
    선언과 생성을 해줘야한다. 타입[] =  new 타입[길이]
    index는 0부터 시작


 */
public class ArrEx1 {
    public static void main(String[] args) {
        int [] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k+2] + score[4];

        for (int i = 0; i < 5; i++) {
            System.out.printf("score[%d] : %d%n", i, score[i]);
        }

        System.out.printf("tmp: %d%n", tmp);
        System.out.printf("score[%d]: %d%n", 7, score[7]);
    }
}
