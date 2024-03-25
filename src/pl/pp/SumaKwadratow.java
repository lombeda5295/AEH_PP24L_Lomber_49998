import java.util.Scanner;

public class SumaKwadratow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj dolny limit:");
            int dolnyLimit = scanner.nextInt();

            System.out.println("Podaj górny limit:");
            int gornyLimit = scanner.nextInt();

            if (gornyLimit <= dolnyLimit) {
                System.out.println("Błąd: Górny limit musi być większy od dolnego limitu.");
                break;
            }

            int sumaKwadratow = obliczSumeKwadratow(dolnyLimit, gornyLimit);
            System.out.println("Suma kwadratów od " + dolnyLimit + " do " + gornyLimit + " wynosi: " + sumaKwadratow);
        }
    }

    public static int obliczSumeKwadratow(int dolnyLimit, int gornyLimit) {
        int suma = 0;
        for (int i = dolnyLimit; i <= gornyLimit; i++) {
            suma += i * i;
        }
        return suma;
    }
}