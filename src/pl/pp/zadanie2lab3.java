import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Zadanie 1: Konwersja dni na tygodnie i dni
        while (true) {
            System.out.print("Podaj liczbę dni (wprowadź wartość niedodatnią, aby zakończyć): ");
            int liczbaDni = scanner.nextInt();

            if (liczbaDni < 0)
                break;

            int tygodnie = liczbaDni / 7;
            int dniReszta = liczbaDni % 7;

            System.out.println(liczbaDni + " dni to " + tygodnie + " tygodni i " + dniReszta + " dni.");
        }

        // Zadanie 2: Konwersja temperatury
        while (true) {
            System.out.print("Podaj temperaturę w stopniach Fahrenheit'a (wprowadź -1, aby zakończyć): ");
            double temperaturaFahrenheit = scanner.nextDouble();

            if (temperaturaFahrenheit == -1)
                break;

            double celsjusz = (temperaturaFahrenheit - 32.0) / 1.8;
            double kelwin = celsjusz + 273.16;

            System.out.printf("%.2f stopni Fahrenheit'a to %.2f stopni Celsjusza i %.2f Kelwina.%n",
                    temperaturaFahrenheit, celsjusz, kelwin);
        }

        scanner.close();
    }
}
