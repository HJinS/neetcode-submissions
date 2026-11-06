class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var product = 1
        val numIdxSet = mutableSetOf<Int>()
        for(idx in 0..nums.lastIndex){
            if(nums[idx] != 0){
                product *= nums[idx]
            } else {
                numIdxSet.add(idx)
            }
        }
        
        val result = IntArray(nums.size)
        for(idx in 0..(nums.lastIndex)){
            if(numIdxSet.isEmpty()){
                result[idx] = product / nums[idx]
            } else{
                if(idx in numIdxSet && numIdxSet.size == 1){
                    result[idx] = product
                } else{
                    result[idx] = 0
                }
            }
        }
        return result
    }
}
