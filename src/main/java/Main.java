import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dzialanie = 0;
        while(dzialanie!=9){
        System.out.println("Wybierz działanie:");
        System.out.println("1 - suma");
        System.out.println("2 - różnica");
        System.out.println("3 - iloczyn");
        System.out.println("4 - iloraz");
        System.out.println("5 - pole prostokąta");
        System.out.println("6 - pole trójkąta (wzór Herona)");
        System.out.println("7 - pole trójkąta");
        System.out.println("8 - najmniejsza liczba");
        System.out.println("9 - koniec");
        
        dzialanie = scan.nextInt();
        
        while(dzialanie==9){
            System.out.println("Koniec programu.");
            break;
        }
        double a = 0, b = 0, c = 0;

        if (dzialanie>=1 && dzialanie<=8) {
            System.out.print("Podaj pierwszą liczbę: ");
            a = scan.nextDouble();
        }
        if (dzialanie >= 1 && dzialanie <= 8) {
            System.out.print("Podaj drugą liczbę: ");
            b = scan.nextDouble();
        }
        if (dzialanie>=6 && dzialanie<=8) {
            System.out.print("Podaj trzecią liczbę: ");
            c = scan.nextDouble();
        }

        switch (dzialanie) {
            case 1:
                System.out.println("Wynik: " + (a + b));
                break;
            case 2:
                System.out.println("Wynik: " + (a - b));
                break;
            case 3:
                System.out.println("Wynik: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Błąd: nie dzielimy przez zero!");
                } else {
                    System.out.println("Wynik: " + (a / b));
                }
                break;
            case 5:
                System.out.println("Pole prostokąta: " + (a * b));
                break;
            case 6:
                double p = (a + b + c) / 2;
                double poleHerona = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Pole trójkąta (Heron): " + poleHerona);
                break;
            case 7:
                System.out.println("Pole trójkąta: " + ((a*a)+(b*b)+(c*c)));
                break;
            case 8:
                double najmniejsza = Math.min(a, Math.min(b, c));
                System.out.println("Najmniejsza liczba to: " + najmniejsza);
                break;
            case 9:
                break;
            default:
                System.out.println("Nieprawidłowy wybór!");
        }
        }
        scan.close();
    }
}