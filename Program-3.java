import java.util.*;
public class OddNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number a: ");
        int a = sc.nextInt();

        // If a is even, reduce by 1 because for even inputs, output is same as previous odd number
      //ex: input 4 (even) as same ouput as input 3 (odd)
        if (a % 2 == 0) {
            a = a - 1;
        }

        for (int i = 0; i < a; i++) {
            System.out.print(2 * i + 1);
            if (i < a - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
