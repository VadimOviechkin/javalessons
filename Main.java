import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);


        int first_number;
        int last_number;
        int end_of_result = 0;
        int temp = 1;
        boolean isPrime = true;


        int[] result;
        result = new int[1000];


        System.out.println("Enter ur first number: ");
        first_number = user_input.nextInt();
        System.out.println("Enter second number: ");
        last_number = user_input.nextInt();


        for (int i = first_number, n = 0; i <= last_number; i++) {
            isPrime = true;

            for (int f = 2; f <= i / 2; f++) {
                temp = i % f;
                if (temp == 0) {
                    isPrime = false;
                }

            }
            if (isPrime) {

                result[n] = i;
                System.out.println(result[n]);
                n++;

            }


        }

    }

}
