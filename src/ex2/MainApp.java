package ex2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class MainApp {
    public static void main(String[] args) {
        try {
            // fișierul de intrare
            BufferedReader reader = new BufferedReader(new FileReader("src/in.txt"));
            // fișierul de ieșire
            PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));


            ArrayList<Integer> numbers = new ArrayList<>();
            int sum = 0;

            // Citește numerele
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                numbers.add(number);
                sum += number;
            }


            double average = (double) sum / numbers.size();
            int min = Collections.min(numbers);
            int max = Collections.max(numbers);


            System.out.println("Suma: " + sum);
            System.out.println("Media aritmetică: " + average);
            System.out.println("Valoarea minimă: " + min);
            System.out.println("Valoarea maximă: " + max);


            writer.println("Suma: " + sum);
            writer.println("Media aritmetică: " + average);
            writer.println("Valoarea minimă: " + min);
            writer.println("Valoarea maximă: " + max);


            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
