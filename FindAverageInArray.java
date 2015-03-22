public class FindAverageInArray {
    public static int getAverage(int[] array){
        int average;
        int sumOfArrayElements = 0;
        for (int num : array){
            sumOfArrayElements+=num;
        }
        double averageInDouble = sumOfArrayElements/array.length;
        average = (int) averageInDouble;
        return average;
    }

    public static void main(String[] args){
        int[] inputArray = new int[] {123, 12, 15, 48, 984, 31, 64, 64, 9, 7, 31, 84};
        System.out.println(getAverage(inputArray));
    }
}
