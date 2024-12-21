import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your Principal value :");
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        System.out.println("Enter your Time :");
        int T = input.nextInt();
        System.out.println("Enter your Rate value :");
        int R = input.nextInt();
        int SI=(P * R * T)/100;
        System.out.println("The required value of S.I. is :" +SI);
    }
}