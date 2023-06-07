public class palindromes {

    public static boolean isStringAPalindrome(String s){

        String reverse = "";

        for (int i = s.length()-1 ; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        System.out.println(s);
        System.out.println(reverse);

        //Compare s and reverse
      return s.equals(reverse);

    }
}
