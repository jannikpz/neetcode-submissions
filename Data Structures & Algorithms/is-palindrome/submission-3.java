class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int y = arr.length -1;
        int x = 0;
        while(x < y){
        while(x < y && !Character.isLetterOrDigit(arr[x])) {
            ++x;
        }
        while(x < y && !Character.isLetterOrDigit(arr[y])) {
            --y;
        }
          if (Character.toLowerCase(arr[x]) != Character.toLowerCase(arr[y])) {
                return false;
            }

            
            x++;
            y--;
            
        }
        return true;
        
    }
}   
    

