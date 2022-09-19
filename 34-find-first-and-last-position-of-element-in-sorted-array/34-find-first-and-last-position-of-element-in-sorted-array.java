class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] answer = {-1, -1};

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                int start = i;
                int end = i;
                int j = i+1;
                for(; j<nums.length; j++){
                    if(nums[j] != target){
                        end = j-1;
                        break;
                    }
                }
                end= j-1;
                answer[0] = start;
                answer[1] = end;
                break;
            }
        }

        return answer;
    }
}