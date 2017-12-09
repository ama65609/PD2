package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // odczyt pliku .csv oddzielonego przecinkami
        String fileName = "/Users/aleksandramatysiak/Desktop/IBM.csv";
        File file = new File(fileName);
        try {
            Scanner inputStream = new Scanner(file);
            inputStream.nextLine(); //pomija pierwszy wiersz
            while (inputStream.hasNext()) {
                String data = inputStream.nextLine(); //daje nam całą linię z pliku

                String[] values = data.split(",");
                double openprice = Double.parseDouble(values[1]);
                double closingprice = Double.parseDouble(values[4]);

                System.out.println(((closingprice-openprice)/openprice));

            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}




