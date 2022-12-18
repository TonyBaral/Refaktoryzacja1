import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Integer liczba1,liczba2;
            Scanner scanner = getScanner();
            wyborWhile(scanner);
        }

    private static Scanner getScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    private static void wyborWhile(Scanner scanner) {
        Integer liczba1;
        Integer liczba2;
        while (true) {
            System.out.println("Podaj liczbę: ");
            liczba1 = scanner.nextInt();
            System.out.println("Podaj druga liczbę: ");
            liczba2 = scanner.nextInt();
            if (liczba1.equals(0) ||  liczba2.equals(0)) {
                break;
            }
            wyborIF(liczba1, liczba2);
        }
    }

    private static void wyborIF(int a, int b) {
        if (a == b) {
            System.out.println("Podane liczby są równe");
        }
        else if (a > b) {
            System.out.println("Pierwsza liczba jest większa");
        }
        else {
            System.out.println("Druga liczba jest większa");
        }
    }
}