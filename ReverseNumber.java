public class ReverseNumber {
    public static void main(String[] args) {
        int num = 54;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;     // get last digit
            reverse = reverse * 10 + digit;  
            num = num / 10;          // remove last digit
        }

        System.out.println("Reversed number: " + reverse);
    }
}