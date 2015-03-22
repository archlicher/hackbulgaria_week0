public class StringPalindrome {

    public static boolean isStringPalindrome(String str){
        int count = 0;
        for(int i = 0;i<str.length()/2;i++){
            if((int)str.charAt(i)==(int)str.charAt(str.length()-1-i)){
                count++;
            } else {
                return false;
            }
        }
        if(count == str.length()/2){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        String[] inputString = {"abcdcba", "abdcba"};
        System.out.println(isStringPalindrome(inputString[0]));
        System.out.println(isStringPalindrome(inputString[1]));
    }
}
