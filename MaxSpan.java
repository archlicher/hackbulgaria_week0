public class MaxSpan {

    public static int maxSpan(int[] array, int a){
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i<array.length;i++){
            if(a == array[i]) {
                startIndex = i;
                break;
            }
        }
        for (int i = array.length-1; i>-1;i++){
            if(a == array[i]) {
                endIndex = i;
                break;
            }
        }
        return endIndex-startIndex+1;
    }

    public static void main(String[] args){
        int[] inputArray = {1, 4, 2, 1, 4, 1, 4};
        int num = 4;
        System.out.println(maxSpan(inputArray, num));
    }
}
