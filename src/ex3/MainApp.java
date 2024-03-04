package ex3;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduceti numarul natural: ");
        int numar= scanner.nextInt();
        System.out.println("Divizorii numarului "+numar+"sunt: ");
        int countdiv=0;
        for (int i=1; i<numar; i++) {
            if ((numar % i) == 0) {
                System.out.println(i + "");
                countdiv++;
            }
        }
        System.out.println();
        if(countdiv==2)
        {
            System.out.println(numar+ "este un numar prim");
        }
        else
        {
            System.out.println(numar+"nu este numar prim");
        }
        scanner.close();
    }
}
