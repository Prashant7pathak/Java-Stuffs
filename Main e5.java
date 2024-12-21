import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int c=2 , isPrime=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any random integer");
        int x = input.nextInt();
        System.out.println("Entered integer is :" +x);
        if(x<=1){
            System.out.println("Number is neither prime nor composite");
        }else {
            while (c*c<=x){
                if (x%c==0){
                isPrime = 0;
                }
                return;
            }
            c=c+1;
        }
        if (isPrime == 0){
            System.out.println("Not Prime");
        }else {
            System.out.println("Prime");
        }

    }
}