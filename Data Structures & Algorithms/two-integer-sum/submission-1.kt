class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val sortedArray: MutableList<Pair<Int, Int>> = mutableListOf()
        for(i in 0..(nums.lastIndex)){
            sortedArray.add(i to nums[i])
        }
        sortedArray.sortWith(compareBy { it.second })

        var (l, h) = 0 to nums.lastIndex
        while(l <= nums.lastIndex && l < h){
            val sum = sortedArray[l].second + sortedArray[h].second
            if(sum < target) l++
            else if(sum > target) h--
            else {
                val idx1 = sortedArray[l].first
                val idx2 = sortedArray[h].first
                if(idx1 < idx2) return intArrayOf(idx1, idx2)
                else return intArrayOf(idx2, idx1)
            }
        }
        return intArrayOf(l, h)
    }
}
