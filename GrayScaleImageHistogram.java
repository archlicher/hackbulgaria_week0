public class GrayScaleImageHistogram {

    public static int[] histogram(short[][] image) {
        int[] result = new int[256];
        for (short i=0; i<256;i++){
            for (short j = 0;j<256;i++){
                short shadeOfGrey = image[i][j];
                result[shadeOfGrey] +=1;
            }
        }
        return result;
    }

    public static void main(String[] args){
        short[][] inputImg = new short[256][256];
        int[] hist = histogram(inputImg);
        System.out.println(hist);
    }
}
