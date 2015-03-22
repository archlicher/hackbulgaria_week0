import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestIntegerPalindrome {

    private static List<Byte> getListFromNumber(long n){
        String numInString = Long.toString(n);
        List<Byte> number = new ArrayList<Byte>();
        for (int i=0;i<numInString.length();i++){
            number.add(Byte.parseByte(numInString.substring(i, i + 1)));
        }
        return number;
    }

    public static long getLargestPalindrome(long n){
        long result=0;
        int count = 0;
        long currentNum;
        for (currentNum = n; currentNum>9;currentNum--) {
            List<Byte> number = getListFromNumber(currentNum);
            for (int i = 0; i < number.size() / 2; i++) {
                if (number.get(i) == number.get(number.size()-1 - i)) {
                    count++;
                } else {
                    break;
                }
            }
            if(count==number.size()/2){
                result = currentNum;
                break;
            }
            count = 0;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long n = Integer.parseInt(scan.nextLine());
        System.out.println(getLargestPalindrome(n));
    }
}
