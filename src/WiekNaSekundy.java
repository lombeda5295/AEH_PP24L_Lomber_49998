import java.util.Scanner;

public class WiekNaSekundy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek w latach: ");
        int wiek = scanner.nextInt();
        long sekundy = (long)wiek * 365 * 24 * 60 * 60;
        System.out.println("Twój wiek w sekundach wynosi: " + sekundy);
    }
}