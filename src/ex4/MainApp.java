package ex4;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random= new Random();

        int nr1= random.nextInt(30) +1;
        int nr2= random.nextInt(30)+1;

        System.out.println("Numarul 1: "+nr1);
        System.out.println("Numar 2: "+nr2);
        int cmmdc=calculCMMD(nr1,nr2);

        System.out.println("Cel mai mare divizor comun: "+cmmdc);

    }
    public static int calculCMMD(int a, int b)
    {
        while (b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;

    }

}
