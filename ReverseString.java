public class ReverseString {

    public static String reverseStr(String[] str){
        String result = "";
        for (int i = 0; i<str.length;i++){
            String word = str[i];
            for(int j = word.length()-1;j>-1;j--){
                result+=word.charAt(j);
            }
            result+=" ";
        }
        return result;
    }

    public static void main(String[] args){
        String inputString = "What is this";
        String[] strArr = inputString.split(" ");
        System.out.println(reverseStr(strArr));
    }
}