public class sub_StringContain_Onlyvowel {
    public static void main(String[] args) {
        String s = "cbaeicdeim";
        System.out.println(max_Vowel_Substring(s));

    }
    public static boolean check_Isvowel(char a){
        if(a == 'a'|| a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A'|| a == 'E' || a == 'I' || a == 'O' || a == 'U'){
            return true;
        }
        return false;
    }

    public static int max_Vowel_Substring(String s){
        int maxCount = 0;
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(check_Isvowel(s.charAt(i)) == false){
                count = 0;
            }
            else if(check_Isvowel(s.charAt(i)) == true){
                count++;
                if(maxCount <= count){
                    maxCount = count;
                }
            }
        }

        return maxCount;
    }
}
