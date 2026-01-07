public class Problem001 {
    public static void main(String[] args) {
        System.out.println("Problem 001 - Project Euler");
        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("Sum of multiplies of 3 or 5: " + sum);

    }
}