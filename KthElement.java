import java.util.Arrays;
import java.util.Scanner;

public class KthElement {
    public static int kthElement(int k, int[] array){
        int kthMin;
        Arrays.sort(array);
        kthMin = array[k];
        return kthMin;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = Integer.parseInt(scan.nextLine());
        int[] inputArray = new int[] {41,53,63,1,6567,5454,23};
        if (k<inputArray.length){
            System.out.println(kthElement(k, inputArray));
        }
    }
}
