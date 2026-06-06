class Solution {
    public boolean isPalindrome(String s) {
        
        String s1 = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (Character.isLetterOrDigit(ch)) {
                s1 += ch;
            }
        }
        
        
        int st=0;

        int ed=s1.length()-1;
        while(st<ed){
        if(s1.charAt(st)!=s1.charAt(ed)){
            return false;
            
        }
        st++;
            ed--;
    }
    return true;
    }
}