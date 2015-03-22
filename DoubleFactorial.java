import java.util.Scanner;

public class DoubleFactorial {
    public static long doubleFactorial(long num){
        long result = 1;
        for (long i = num;i>1;i--){
            result*=i;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scan.nextLine());
        long finalResult;
        finalResult = doubleFactorial(inputNumber);
        finalResult = doubleFactorial(finalResult);
        System.out.println(finalResult);
    }
}
