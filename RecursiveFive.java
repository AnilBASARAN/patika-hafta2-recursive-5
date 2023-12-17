import java.util.Scanner;
public class RecursiveFive {
    public static void main(String[] args) {
            // Kullanıcıdan n değerini al
            Scanner input = new Scanner(System.in);
            System.out.print("Sayı giriniz:   ");
            int n = input.nextInt();

            // Recursive metodu çağırarak sonuçları ekrana yazdır
            printNumbers(n);
        }

        // Recursive metot
        public static void printNumbers(int n) {
            // Basis case: n 0 veya negatifse, işlemi sonlandır ve çıkış yap
            if (n <= 0) {
                System.out.print(n + " ");
                return;
            }

            // İlk olarak 5 çıkar ve değeri yazdır
            System.out.print(n + " ");

            // Recursive olarak fonksiyonu tekrar çağır ve 5 çıkar
            printNumbers(n - 5);

            // Sayı negatif veya 0 olduktan sonra 5 ekleyerek tekrar çağır
            System.out.print(n + " ");
        }
    }