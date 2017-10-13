package sumevennofibonacci;

import java.util.Scanner;

/**
 *
 * @author batefirok
 */
public class Solution {

    /**
     * sum of even-valued terms by starting with 1 and 2
     * @param n
     * @return 
     */
    public static int sumEvenNumbers(int n) {

        int sum = 0, step = 1, back = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                step = 1;
            }
            if (i > 1) {
                int dummy = step;
                step = step + back;
                back = dummy;
            }

            if (step <= 4000000) {
                if (step % 2 == 0) {
                    sum = sum + step;
                }
            } else {
                break;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter the number of terms and should be greater than 0 as the fibonacci sequence starts with 1 and 2");
            n = scanner.nextInt();
        }while(n<=0);
        
        System.out.println(sumEvenNumbers(n));
    }

}
