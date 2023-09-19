public class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        int first = nums[0];

        while (true){
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];
            if(nums[slow] == first || nums[fast] == first){
                return first;
            }
            if(slow == fast){
                break;
            }
        }
        int fromStart = 0;

        while (fromStart != slow){
            slow = nums[slow];
            fromStart = nums[fromStart];
        }
        return slow;
    }

}
