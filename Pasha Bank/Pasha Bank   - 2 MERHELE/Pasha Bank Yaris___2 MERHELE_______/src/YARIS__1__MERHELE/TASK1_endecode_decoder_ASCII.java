package YARIS__1__MERHELE;

public class TASK1_endecode_decoder_ASCII {

    public static void main(String[] args) {
        System.out.println(decode("23511011501782351112179911801562340161171141148"));
    }

    public static String decode(String encoded) {
        int number = 0;
        String decode = "";

        StringBuilder builder = new StringBuilder(encoded);
        builder.reverse();

        String newStr = new String(builder);

        for (int i = 0; i < newStr.length() - 1;) {

            number = Integer.parseInt(newStr.substring(i, i + 2));
            char letter = 0;
            if (number >= 65 && number <= 90) {
                letter = (char) number;
            } else if (number >= 97 && number <= 122) {
                letter = (char) number;
            } else if (number == 32) {
                letter = (char) number;
            } else {
                if (i == newStr.length() - 2) {

                } else {
                    number = Integer.parseInt(newStr.substring(i, i + 3));
                    if (number >= 65 && number <= 90) {
                        letter = (char) number;
                        i++;
                    } else if (number >= 97 && number <= 122) {
                        letter = (char) number;
                        i++;
                    }
                }
            }
            decode += letter;
            i = i + 2;

        }

        return decode;
    }
}
