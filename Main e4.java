import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a= input.nextInt();
        System.out.println("Enter the value of b:");
        int b= input.nextInt();
        System.out.println("Enter the value of c");
        int c = input.nextInt();
        int Average = (a+b+c)/3;
        System.out.println("Your Average is :" +Average);
    }
}