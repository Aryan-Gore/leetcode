class Solution {
    public int sum(int num){
   
        int sum = 0;

        while(num != 0){

            int digit = num % 10 ;

             sum +=  digit;

             num/=10;
        }

        return sum;


    }
    public int addDigits(int num) {

            num = sum(num);
    
    while(true){
            switch(num){
            case 0 :
                  return 0;
             case 1 :
                  return 1 ;
             case 2 :
                  return 2 ;
             case 3 :
                  return 3 ;
             case 4 :
                  return 4 ;
             case 5 :
                  return 5 ;
             case 6 :
                  return 6 ;
             case 7 :
                  return 7 ;
             case 8 :
                  return 8 ;
             case 9 :
                  return 9 ;
             default :
                num =  sum(num) ;
            }
    }
       
    }
}