import java.util.Scanner;

public class Main {
    //Function
    public static double power(double a, int n) {
    if (n == 0) {
        return 1;
    } else if (n < 0) {
        return 1 / power(a, -n);
    } else if (n % 2 == 0) {
        double temp = power(a, n/2);
        return temp * temp;
    } else {
        return a * power(a, n-1);
    }
}
    //Function work check
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        double res = power(a, n);
        int result = (int) res;
        System.out.println(result);
    }
}