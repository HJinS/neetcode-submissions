class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val uniqueList = nums.toSet().toList()
        return uniqueList.size != nums.size
    }
}
