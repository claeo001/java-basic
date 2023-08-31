package opp;
class Data { int x;}
public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main()  : x = " + d.x);

        chang(d);

    }

    private static void chang(Data d) {
        d.x =1000;
        System.out.println("main() : x  = " + d.x);

    }

}
