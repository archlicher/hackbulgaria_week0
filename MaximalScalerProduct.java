import java.util.Arrays;

public class MaximalScalerProduct {

    public static long maximumScalarSum(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        long maxSum = 0;
        for(int i =0;i<a.length;i++){
            maxSum += a[i]*b[i];
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] vectorA = {12,43,4};
        int[] vectorB = {3,32,16};
        System.out.println(maximumScalarSum(vectorA,vectorB));
    }
}
