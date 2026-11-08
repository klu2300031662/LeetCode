class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++){
            int setBits = countSetB(i);
            if(isPrime(setBits)){
                count++;
            }
        }
        return count;
    }
    static int countSetB(int num){
        int count = 0;
        while(num > 0){
            if((num&1) == 1){
                count++;
            }
            num >>= 1;
        }
        return count;
    }
    static boolean isPrime(int num){
        if(num == 1 || num == 0){
            return false;
        }
        if(num == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}