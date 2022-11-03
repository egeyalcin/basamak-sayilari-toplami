import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int numbersRemainder;
        int sum = 0;
        int a = 2451, basamakSayisi = 0, numberCounter = 0;


        while (a != 0) {
            a /= 10;
            numberCounter++;

        }

        for (int i = 0;i< numberCounter;i++) {
            numbersRemainder = number % 10;
            number = number / 10;
            sum += numbersRemainder;
            System.out.println(numbersRemainder);
        }
        System.out.println("Sayilarin toplami :" + sum);

    }
}
