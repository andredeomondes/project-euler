import java.sql.SQLOutput;

public class Problem002 {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("    Problem 002 - Project Euler");
        System.out.println("---------------------------------");
        System.out.println();

        int numberA = 1, numberB = 2, nextNumber;


        int sum = 0;

        while (sum < 4000000) {
            if (numberA % 2 == 0) {
                System.out.println(numberA);
                sum += numberA;

            }

            nextNumber = numberA + numberB;
            numberA = numberB;
            numberB = nextNumber;

        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Total: " + sum);


    }
}