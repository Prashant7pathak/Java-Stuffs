import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your amount : ");
        Scanner input = new Scanner(System.in);
        float Dollar = input.nextFloat();
        float Currency = (Dollar * 84.95f);
        System.out.println("The total amount is(in Rupees) " +Currency);
    }
}