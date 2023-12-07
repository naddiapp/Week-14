import java.util.Scanner;
public class DescendingSequenceRecursive {
    static void DescendingSequenceRecursive(int n) {
        if(n>= 0) {
            System.out.print(n + " ");
            DescendingSequenceRecursive(n-1);
        }
    }
    static void descendingsequencerecursive(int n) {
        for(int i= n; i>= 0; i--) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Input value of n: ");
        n = sc.nextInt();

        System.out.print("Sequence of recursive: ");
        DescendingSequenceRecursive(n);
        System.out.println();

        System.out.print("Sequence Iterative: ");
        descendingsequencerecursive(n);
    }
} 