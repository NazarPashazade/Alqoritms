package ReqemlerinCemi;

public class ReqemlerinCemiIstenilenEdedUcun {

    public static void main(String[] args) {
        int a = 1234567;
        String reqem = a + "";
        int sumAmount = 0;

        for (int i = 0; i < reqem.length(); i++) {

            int reqemInt = Integer.parseInt(reqem.valueOf(reqem.charAt(i)));

            sumAmount += reqemInt;

        }
        System.out.println(sumAmount);
    }                                                
}
