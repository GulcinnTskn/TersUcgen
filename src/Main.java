/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // satırdaki yıldız sayısı 2n-1
        //boşluk sayısı n-i

        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısı giriniz: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {  // boşluk sayısı
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
