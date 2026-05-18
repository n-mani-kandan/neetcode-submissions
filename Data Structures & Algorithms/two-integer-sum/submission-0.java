class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){

            for(int j=0;j<nums.length;j++){
                int temp = target-nums[i];
                if(temp==nums[j] && i != j){
                    arr[0] = j;
                    arr[1] = i;
                    break;
                }
            }
        }

        return arr;
    }
}
