public class RaiseOnPow {

    public static long pow(int a, int b){
        long c = 1;
        for(int i = 0;i<b;i++){
            c*=a;
        }
        return c;
    }

    public static void main(String[] args){
        int root = 2;
        int exponential = 5;
        long result = pow(root,exponential);
        System.out.println(result);
    }
}
