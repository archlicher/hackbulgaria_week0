import java.util.Scanner;

public class IsPrimeNum {

    public static boolean isPrime(int n){
        double sqrtOfNum = Math.sqrt(n);
        for(int divider = 2; divider<=sqrtOfNum;divider++){
            if(n%divider==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scan.nextLine());
        if(isPrime(inputNumber)){
            System.out.printf("The number %d is prime", inputNumber);
        } else {
            System.out.printf("The number %d is not prime",inputNumber);
        }
    }
}
