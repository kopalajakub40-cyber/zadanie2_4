import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz dzialanie");
        System.out.println("1 - suma");
        System.out.println("2 - roznica");
        System.out.println("3 - iloczyn");
        System.out.println("4 - iloraz");
        int dzialanie = scan.nextInt();
      
       System.out.println("Podaj pierwsza liczbe");
       double a = scan.nextDouble();
       System.out.println("Podaj druga liczbe");
       double b = scan.nextDouble();
      
      switch(dzialanie){
          case 1:
          System.out.println("Wynik::"+(a + b));
          break;
        case 2:
          System.out.println(a - b);
          break;
        case 3:
          System.out.println(a * b);
          break;
        case 4:
          if (b==0){
            System.out.println("Nie dzielimy przez zero");
          }
          else{
            System.out.println(a / b);
          }
          break;
        default:
          System.out.println("Zły wybór");
      }
    }
}