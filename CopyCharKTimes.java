public class CopyCharKTimes {
    public static void main(String[] args){
        String inputStr = "that";
        int times = 4;
        String result = "";
        for(int i = 0; i<inputStr.length();i++){
            for (int j = 0; j<times;j++) {
                result += inputStr.charAt(i);
            }
        }
        System.out.println(result);
    }
}
