import java.util.Arrays;

public class MinNumInArray {

    public static int min(int[] array){
        int min;
        Arrays.sort(array);
        min = array[0];
        return min;
    }

    public static void main(String[] args){
        int[] inputArray = new int[] {41,53,63,1,6567,5454,23};
        System.out.println(min(inputArray));
    }
}
