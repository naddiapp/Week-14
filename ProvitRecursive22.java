import java.util.Scanner;

public class ProvitRecursive22 {
    static double calculateProfit(double balance, int period) {
        if(period==0) {
            return balance;
        }else{
            return 1.11*calculateProfit(balance, period-1); 
        }
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double intialBalance;
        int period;

        System.out.print("Input Balance: ");
        intialBalance = sc.nextInt();
        System.out.print("Investment Period: ");
        period = sc.nextInt();

        System.out.println("Balance after "+period+" year = "+
                            calculateProfit(intialBalance, period));
    }
}
    

