import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter any number in a :");
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        System.out.println("Enter the value of b :");
        int b = input.nextInt();
        if(a>b) {
            System.out.println("greater number is " +a);
        }else {
            System.out.println("Greater number is " +b);
        }
    }
}