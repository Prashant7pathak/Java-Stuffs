import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("For Percentage Calculation Enter your marks here");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of maths");
        int maths = sc.nextInt();
        System.out.println("Enter the Marks of IT");
        int it = sc.nextInt();
        System.out.println("Enter the Marks of Sst");
        int sst = sc.nextInt();
        System.out.println("Enter the Marks of Hindi");
        int hindi = sc.nextInt();
        System.out.println("Enter the Marks of Science");
        int sci = sc.nextInt();
        int per=((sst+hindi+sci+it+maths)*100)/500;
        System.out.println(per);

    }
}