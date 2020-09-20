package PassByValue;

public class PassByValue {

    public static void main(String[] args) {
        int a = 5;

        System.out.println("before" + a);
        System.out.println("After" + a);
        getValue(a);

    }

    public static void getValue(int a) {
        a = 7;
        System.out.println("Inside" + a);
    }
}
