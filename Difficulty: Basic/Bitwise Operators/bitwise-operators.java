import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // code here
        int d = a ^ a;   // XOR
        int e = c ^ b;   // XOR
        int f = a & b;   // AND
        int g = ~e;    

        System.out.println(d + " " + e + " " + f + " " + g);
    }
}