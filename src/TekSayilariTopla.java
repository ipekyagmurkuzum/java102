import java.util.Scanner;

public class TekSayilariTopla {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number,total=0;
        do {
            System.out.print("Sayı giriniz:");
            number = scan.nextInt();
            if(number%2 == 1) {
                total += number;
            }
        } while (number > 0);
        System.out.println(total);
    }
}
