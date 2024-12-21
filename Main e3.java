import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
////        System.out.println("Enter any random number");
////        Scanner input = new Scanner(System.in);
////        System.out.println(input.nextInt());
//        System.out.println("Enter anything");
//        Scanner Anything = new Scanner(System.in);
//        System.out.println(Anything.nextLine());
        System.out.println("Enter the value of A");
        Scanner input1 =new Scanner(System.in);
        int A=input1.nextInt();
        System.out.println("Enter the value of B");
        Scanner input2 = new Scanner(System.in);
        int B=input2.nextInt();
        int C =A+B;
        System.out.println("Sum of two numbers are:"  +C);
    }
}