package variable;
/*
    문자를 숫자로 변환시키면 인코딩 반대로는 디코딩이라한다.
    전 세계 모든 문자를 하나의 통일집합으로 만든게 유니코드
 */
public class VarEx9 {
    // 타입의 표현하는 값을 넘는걸 오버플로우 라고 한다.
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;
        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1 = " + (short)(sMin-1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1 = " + (short)(sMax+1));
        System.out.println("cMin = " + cMin);
        System.out.println("cMin-1 = " + (int)--cMin);
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax+1 = " + (int)++cMax);

    }
}
