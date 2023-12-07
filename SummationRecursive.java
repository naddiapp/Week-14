import java.util.Scanner;
public class SummationRecursive {
    public static int Summationrecursive(int n, int f) {
        if(n==f) {
            return n;
        }else{
            return n + Summationrecursive(n+1, f);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f, i, n = 1, result;
        System.out.print("Input value of f: ");
        f = sc.nextInt();

        System.out.print("summation result 1-" + f + ":");
        for(i= 1; i<= f; i++) {
            System.out.print(i + " + ");
        }
        System.out.print(" : ");
        result = Summationrecursive(n, f);
        System.out.print(result);
    }
}
