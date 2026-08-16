class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for(int i = 0; i < n + 1; i++){
            int num = getOnes(i);
            res[i]=num;
        }
        return res;
    }

    public static int getOnes(int n){
        int res = 0;
        for (int i = 0; i < 32; i++){
            if((1 << i & n) != 0){
                res++;
            }
        }
        return res;
    }
}
