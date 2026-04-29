class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans=0;
        Stack<Integer> stack=new Stack<>();
        for(int x:set){
            if(!set.contains(x-1)){
                int curr=x;
                int c=1;
                while(set.contains(curr+1)){
                    curr++;
                    c++;
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}
