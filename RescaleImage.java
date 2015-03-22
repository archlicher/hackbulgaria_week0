public class RescaleImage {

    public static int[][] rescale(int[][] img, int newWidth, int newHeight){
        int[][] newMatrix = new int[newWidth][newHeight];
        if (newHeight == img.length && img[0].length == newWidth) {
            return img;
        } else {
            if(img.length>newWidth){
                int scaler = img.length/newWidth;
                int currentNum = 0;
                for(int h = 0; h<newWidth;h++) {
                    for (int k = 0; k<newHeight;k++) {
                        for (int i = h * scaler; i < h * scaler + scaler; i++) {
                            for (int j = k*scaler; j < k*scaler+scaler; j++) {
                                currentNum+=img[i][j];
                            }
                        }
                        currentNum/=scaler;
                        newMatrix[h][k] = currentNum;
                    }
                }
            } else {
                //TODO when the new matrix is bigger
            }
        }
        return newMatrix;
    }

    public static void main(String[] args){
        int count = 0;
        int[][] arr = new int[100][100];
        for(int i = 0; i<100;i++){
            for (int j = 0;j<100;j++){
                arr[i][j] = count++;
            }
        }
        int[][] result = rescale(arr,10,10);
        for(int i = 0; i<10;i++){
            for (int j = 0;j<10;j++){
                System.out.printf("%d, ",result[i][j]);
            }
            System.out.println();
        }
    }
}
