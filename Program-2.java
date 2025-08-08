import java.util.Scanner;

public class OddNumbersSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number a: ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.print(2 * i + 1);// nth odd number
            if (i < a - 1) {
                System.out.print(", ");
            
        }

        sc.close();
    }
}
