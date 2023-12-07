import java.util.Scanner;
public class PrimeCheckingRecursive {
    static boolean PrimeCheckingRecursive(int n, int i) {
        if(i<=1) {
            return true;
        }else{
            if(n%i == 0) {
                return false;
            }else{
                return PrimeCheckingRecursive(n, i-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number;

        System.out.print("Input a number: ");
        number = sc.nextInt();

        if (PrimeCheckingRecursive(number,number/2)) {
            System.out.println(number + "primes number");
        }else{
            System.out.println(number + "not a prime number");
        }
    }
}
