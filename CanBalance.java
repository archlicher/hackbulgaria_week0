public class CanBalance {

    public static boolean canBalance(int[] array){
        for (int i = 1; i<array.length-1;i++){
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0;j<=i;j++){
                sumLeft+=array[j];
            }
            for (int h = i+1;h<array.length;h++){
                sumRight +=array[h];
            }
            if(sumLeft==sumRight){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,1,1,2,1};
        System.out.println(canBalance(arr));
    }
}
