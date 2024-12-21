import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a valid Temperature(in C):");
        Scanner input = new Scanner(System.in);
        float TempC = input.nextFloat();
        float TempF =  (TempC*9/5)+32;
        System.out.println("Your converted Temperature is(in F):" +TempF);
    }
}