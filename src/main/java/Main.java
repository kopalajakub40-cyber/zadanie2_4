import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Wprowadz liczbe: ");
    int a = scan.nextInt();
    boolean pierwsza = true;

    if(a<2){
      pierwsza = false;
    }
    else{
      for(int i=2; i*i<=a; i++){
        if(a%i==0){
          pierwsza = false;
          break;
        }
      }
    }
    if(pierwsza){
      System.out.println("Liczba jest pierwsza");
    }else{
      System.out.println("Liczba nie jest pierwsza");
    }
  }
}  