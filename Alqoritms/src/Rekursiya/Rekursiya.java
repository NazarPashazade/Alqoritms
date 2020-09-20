package Rekursiya;

public class Rekursiya {

    public static void main(String[] args) {
        print(0);
    }

    public static int print(int x) {
        System.out.println(x);
        x++;
        if (x == 100) {
            return 0;
        }
        return print(x);
    }

}
