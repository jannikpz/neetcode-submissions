class Solution {
    public double myPow(double x, int n) {
        long nlong=n;
        return helperPow(x,nlong);
    }

    public double helperPow(double x,long n){
        
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 1/ helperPow(x,-n);
        }else{
            if(n%2 ==0){
            double half = helperPow(x,n/2);
            return half * half;
            }else{
            double half = helperPow(x,n/2);
            return half * half * x;    
            }
        }
    }
}

