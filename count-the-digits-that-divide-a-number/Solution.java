class Solution {
    public int countDigits(int num) {
        
        int count = 0;

        int a = num;

        while(a != 0){
        
        int digit = a % 10 ;
          if(num % digit == 0){
               count++;
          }

         a/=10;

        }
        
        return count;
    }
}