package _02_loopstatement.exercises;


public class HundredPrime {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
