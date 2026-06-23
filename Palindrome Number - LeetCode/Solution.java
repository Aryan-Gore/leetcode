class Solution {
    public boolean isPalindrome(int x) {

        int rev = 0;
        int n , y = x;

    if(x < 0){
            return false;
        }
        
        while(x!=0){

            n = x % 10;
            rev = rev * 10 + n;
            x/=10;

        }
        if(rev == y){
            return true;
        }
         return false;
    }
    
}