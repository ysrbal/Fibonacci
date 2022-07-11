import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = 0;
        int b = 1, c;
        System.out.print("Eleman Sayisini Giriniz : ");
        int n = inp.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;


        }

    }
}
