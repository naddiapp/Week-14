import java.util.Scanner;
public class GuineaPigs {
    static int CountTheNumberofGuineaPigs(int month) {
        if(month<= 1) {
            return month;
        }else{
            int result= CountTheNumberofGuineaPigs(month-1) + CountTheNumberofGuineaPigs(month-2);
            return result;
        }
    }
    public static void main(String[] args) {
        int month;
        Scanner input= new Scanner(System.in);
        System.out.print("Input number of months: ");
        month= input.nextInt();

        System.out.println("Number of guinea pigs pairs at the end of month " + month + " is: "+ CountTheNumberofGuineaPigs(month));
    }
}
