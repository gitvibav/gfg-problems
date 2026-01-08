// User function Template for Java

class Solution {
    public int[] common_digits(int[] nums) {
        int[] freq = new int[10];
        
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            while(n > 0){
                int digits = n%10;
                freq[digits] = 1;
                n = n/10;
            }
        }
        
        int count = 0;
        for(int i : freq){
            if(i == 1) count++;
        }
        
        int res[] = new int[count];
        int idx = 0;
        for(int i=0;i<10;i++){
            if(freq[i] == 1){
                res[idx++] = i;
            }
        }
        
        return res;
    }
}