public class GetOddOccurrence {

    public static int getOddOccur(int[] array){
        int result = 0;
        int count = 0;
        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array.length; j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count%2==1){
                result = array[i];
                break;
            }
            count = 0;
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2,1,3,4,3,4,4,6,5,6,5};
        System.out.println(getOddOccur(arr));
    }
}