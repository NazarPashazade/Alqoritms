package FilerReaderndWritter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class File_Nese_yazib_Oxumaq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Faylin adini yazin");
        String fileName = sc.next();

        System.out.println("Fayla yazmaq isdediyiniz melumati daxil edin :");
        sc.nextLine();
        String data = sc.nextLine();

        dataWriterMethod(data, fileName);
        
        
        System.out.println("File daki melumatlar");
        dataReaderMethod(fileName);

    }

    public static void dataWriterMethod(String text, String fileName) {

        try {
            FileWriter fw = new FileWriter("C:/Users/pashayev/Desktop/" + fileName + ".txt", true);
            fw.write(text);
            fw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void dataReaderMethod(String fileName) {
        try {
            FileReader fr = new FileReader("C:/Users/pashayev/Desktop/"+fileName+".txt");
            BufferedReader br = new BufferedReader(fr);

            String line = "";

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            fr.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
