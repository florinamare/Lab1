package ex1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti lungimea: ");
        int lungime = scanner.nextInt();

        System.out.println("Introduceti latimea: ");
        int latime = scanner.nextInt();

        int perimetru = 2*(lungime+latime);
        int aria = lungime*latime;

        System.out.println("Perimetrul este: "+ perimetru);
        System.out.println("Aria: "+ aria);

        scanner.close();
    }
}
