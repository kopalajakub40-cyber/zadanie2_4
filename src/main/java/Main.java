import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner liczenie = new Scanner(System.in);

    System.out.println("Podaj 1 liczbę: ");
    double a = liczenie.nextDouble();

    System.out.println("Podaj 2 liczbę: ");
    double b = liczenie.nextDouble();

    double suma = a+b;
    System.out.println("Suma wynosi: " + suma);
  }
}