import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastDigit = n % 10;
        // code here
        if (lastDigit < 0) {
            lastDigit = -lastDigit;
        }

        System.out.println(lastDigit);
    }
}