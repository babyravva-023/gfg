import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        
        for (int i = 0; i < n; i++) {          // rows
            for (int j = 0; j < n; j++) {      // columns
                System.out.print("* ");
            }
            System.out.println(); // next line after each row
        }
    }
}