package opp;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었음.");
        firstMethod();
        System.out.println("main(String[] args)이 끝났음");
    }

    private static void firstMethod() {
        System.out.println("firstMethod()이 시작됨");
        secondMethod();
        System.out.println("firstMethod()이 끝남");
    }

    private static void secondMethod() {
        System.out.println("secondMethod()이 시작");
        System.out.println("secondMethod()이 끝남");
    }
}
