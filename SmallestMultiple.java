import java.util.*;

public class SmallestMultiple {

    public static List<Long> trueDividers = new ArrayList<Long>();

    public static List<Long> currentPrimes(long number){
        long copyOfInput = number;
        List<Long> currentPrimes = new ArrayList<Long>();
        for (long i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                currentPrimes.add(i);
                copyOfInput /= i;
                i--;
            }
        }
        return currentPrimes;
    }

    public static void getTrueDividers(long number) {
        for (long i=number;i>1;i--) {
            List<Long> primesInNumber = currentPrimes(i);
            for (long num : primesInNumber) {
                if (!trueDividers.contains(num)) {
                    trueDividers.add(num);
                } else {
                    int countCurrentNum = 0;
                    int countTrueNum = 0;
                    for (long sameNum : primesInNumber) {
                        if (sameNum == num) {
                            countCurrentNum++;
                        }
                    }
                    for (long sameNum : trueDividers) {
                        if (sameNum == num) {
                            countTrueNum++;
                        }
                    }
                    if (countCurrentNum > countTrueNum) {
                        while (countCurrentNum - countTrueNum > 0) {
                            trueDividers.add(num);
                            countCurrentNum--;
                        }
                    }
                }
            }
        }
    }

    public static long getSmallestMultiple(){
        long result = 1;
        for (long num : trueDividers){
            result*=num;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int upperBound = Integer.parseInt(scan.nextLine());
        getTrueDividers(upperBound);
        System.out.println(getSmallestMultiple());
    }
}