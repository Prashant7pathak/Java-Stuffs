import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter any random number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num%2==0){
            System.out.println("This is a Even number");
        }else{
            System.out.println("it is a Odd number");
        }
    }
}