package Baslangic;
import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        int a, b, c;
        double cevre, alan, u;
        Scanner kenar = new Scanner(System.in);
        System.out.println("Üçgenin sırasıyla kenar uzunluklarını girin : " );
        a = kenar.nextInt();
        b = kenar.nextInt();
        c = kenar.nextInt();
        cevre = a + b + c;
        u = cevre/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Çevresi : " + cevre);
        System.out.print("Üçgenin Alanı : " + alan);
    }
}
