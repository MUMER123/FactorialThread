import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        MyThread t = new MyThread("factorial",number);
        t.start();
        sc.close();
    }
}