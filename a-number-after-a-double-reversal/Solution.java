class Solution {
    public  int rev(int num){
             int rev = 0 ;
             while(num != 0 ){
                
                int digit =  num % 10 ;
                    
                    rev = rev*10 + digit ;

                    num/=10;

             }

             return rev;

    }
    public boolean isSameAfterReversals(int num) {

        return  num == rev(rev(num)) ;
        
    }
}