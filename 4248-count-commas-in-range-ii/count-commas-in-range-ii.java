class Solution {
    public long countCommas(long n) {
         if (n<1000) {
            return 0;
        }
        long comma = 0;
        for (long i = 1000;i<=n;i=i*1000){
            comma += (n-i)+1;

        }
        return comma;
    }
};
