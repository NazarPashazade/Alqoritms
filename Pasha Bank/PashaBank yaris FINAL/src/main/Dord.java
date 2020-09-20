package main;

public class Dord {

    public static void main(String[] args) {
        String s = "))((";
        System.out.println("Result = " + minSwaps(s));
    }

    public static int minSwaps(String s) {
        int duz = 0;
        int ters=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                duz++;
            }
            
            if(s.charAt(i)=='('){
                ters++;
            }
        }
        
        System.out.println("duz = "+duz);
        System.out.println("ters = "+ters);

        return 0;
    }
}
