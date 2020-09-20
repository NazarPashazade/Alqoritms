package find_second_word;

public class Second {

    public static void main(String[] args) {
        String cumle = "men developiada oxuyuram";

        int birincibosluqIndex = cumle.indexOf(" ");

        int ikincibosluqIndex = cumle.indexOf(" ", birincibosluqIndex+1);

        String ikinciSoz=cumle.substring(birincibosluqIndex, ikincibosluqIndex);
        
        System.out.println(ikinciSoz);
    }
}
