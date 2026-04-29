class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        StringBuilder sb1=new StringBuilder(sb.toString());
        
        if(sb1.reverse().toString().toLowerCase().equals(sb.toString().toLowerCase())){
            return true;
        }
        else{
            return false;
        }
    }
}
