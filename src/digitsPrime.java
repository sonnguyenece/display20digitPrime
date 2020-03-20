public class digitsPrime {
    public static void main(String[] args) {
        String display = "2";
        int count = 1;
        int n = 3;
        boolean isPrime = true;
        while (count < 20) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                display += (" " + n);
                count++;
            }
            isPrime = true;
            n++;
        }
        System.out.printf(" %s", display);
    }
}
