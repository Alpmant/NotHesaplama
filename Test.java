import java.io.Console;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mat,fizik,biyoloji,türkce,kimya;

        System.out.print("Matematik:");
        mat = input.nextInt();
        System.out.print("Fizik:");
        fizik = input.nextInt();

        System.out.print("Biyoloji:");
        biyoloji = input.nextInt();

        System.out.print("Türkçe:");
        türkce = input.nextInt();
        System.out.print("Kimya:");
        kimya = input.nextInt();

        double ortalama = (mat+fizik+biyoloji+türkce+kimya)/5;
        System.out.print("Ortalamanız: " + ortalama + " "+  (ortalama > 60 ? "Sınıfı Geçti":"Sınıfta Kaldı"));









    }
}
