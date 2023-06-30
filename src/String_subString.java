public class String_subString {
    public static void main(String[] args) {
        String s = "nitin";
        print_Substring(s);
//        for(int i = 0; i < s.length(); i++){
//            for(int j = i; j < s.length(); j++){
//                for(int k = i; k <=j; k++ ){
//                    System.out.print(s.charAt(k));
//                }
//                System.out.println();
//            }
//        }

    }

    public static boolean is_Palindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else {

                return false;
            }
        }

        return true;
    }

    public static void print_Substring(String str) {
        int first_Big = 0;
        int second_Big = -1;
      for(int i = 0; i < str.length(); i++){
          for(int j = i+1; j <= str.length(); j++){
              String s2 = str.substring(i,j);
              boolean res = is_Palindrome(s2);
              if(res == true){
                  if(s2.length() > first_Big){
                      second_Big = first_Big;
                      first_Big = s2.length();
                  }
                  else if(s2.length() > second_Big && s2.length() < first_Big){
                      second_Big = s2.length();
                  }
                  System.out.println(s2);
              }
            //  System.out.println(str.substring(i,j));
          }
      }

      int ans = first_Big * second_Big;
      System.out.println("====>>>" + ans);
    }
}

