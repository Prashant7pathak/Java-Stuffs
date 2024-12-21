import java.util.Scanner;
//                     -: Table printing :-
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n= input.nextInt();
        System.out.println("Write the table of:" +n);
        for (i=n;i<=n*10;i=i+n){
            System.out.println(i);
        }
    }
}