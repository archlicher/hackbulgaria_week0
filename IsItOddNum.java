import java.util.Scanner;

public class IsItOddNum {

    public static boolean isItOdd(int n){
        if (n%2!=0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scan.nextLine());
        if (isItOdd(inputNumber)){
            System.out.printf("The number %d is odd!", inputNumber);
        } else {
            System.out.printf("The number %d is not odd!", inputNumber);
        }
    }
}
