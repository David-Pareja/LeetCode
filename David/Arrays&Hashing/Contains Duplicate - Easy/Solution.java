class Solution {
    public boolean hasDuplicate(int[] nums) {
        int key = 0;   
    while (key < nums.length){
        for (int i = 0; i < nums.length; i++){
            if (i != key && nums[i] == nums[key]){
            return true;
            }
        }
        key++;
    }
    return false;
}
}