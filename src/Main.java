import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;

        Scanner inp = new Scanner(System.in);
        System.out.print("1'inci sayiyi giriniz:");
        a = inp.nextInt();
        System.out.print("2'nci sayiyi giriniz:");
        b = inp.nextInt();
        System.out.print("3'uncu sayiyi giriniz:");
        c = inp.nextInt();

        if (a > b && a > c) {
            System.out.print(a + ">");
            if (b > c) {
                System.out.print(b + ">" + c);

            } else {
                System.out.print(c + ">" + b);
            }
        } else if (b > a && b > c) {
            System.out.print(b + ">");
            if (a > c) {
                System.out.print(a + ">" + c);

            } else {
                System.out.print(c + ">" + a);
            }

        } else {
            System.out.print(c + ">");
            if (a > b) {
                System.out.print(a + ">" + b);
            } else {
                System.out.print(b + ">" + a);
            }
        }


    }
}
