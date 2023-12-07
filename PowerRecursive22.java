import java.util.Scanner;
public class PowerRecursive22 {
    static int calculatePower(int base, int pow) {
        if(pow==0) {
            return 1;
        }else{
            return base*calculatePower(base, pow-1);
        }
    }
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Number: ");
    int Num= input.nextInt();
    System.out.print("Calculated Number: ");
    int Number= input.nextInt();
    System.out.print("Power Number: ");
    int power= input.nextInt();

    System.out.print(Number);
    for(int i= 1;i<power; i++) {
        System.out.print(" x " + Number);
    }
    System.out.print(" x 1 ");
    System.out.print(" = "+ calculatePower(Number, power));
}
}

