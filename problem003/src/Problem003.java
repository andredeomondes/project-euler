
public class Problem003 {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");
        System.out.println("|              PROBLEM 003             |");
        System.out.println("---------------------------------------");
        long number = 600851475143L;
        long biggestFactor = 0;

        System.out.println("Number: " + number);

        System.out.print("Prime factors: ");
        for (long i = 2; i <= number; i++) {
            while (number % i == 0) {
                biggestFactor = i;
                System.out.print(biggestFactor + " ");
                number /= i;
            }
        }


        System.out.println("\nBiggest prime factor:  " + biggestFactor);

    }
}
