import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);

    }
}