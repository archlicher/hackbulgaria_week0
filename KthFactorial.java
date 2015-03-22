import java.util.Scanner;

public class KthFactorial {

    public static long kthFactorial(long n){
        long current = 1;
        for (long i = 1;i<=n;i++){
            current*=i;
        }
        return current;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scan.nextLine());
        int kthNum = Integer.parseInt((scan.nextLine()));
        long result = inputNumber;
        for (int i = 0;i<kthNum;i++){
            result = kthFactorial(result);
        }
        System.out.println(result);
    }
}
