class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val cntHeap = PriorityQueue<Pair<Int, Int>>{ a, b -> a.second - b.second }

        nums.sort()
        var baseNum = nums[0]
        var count = 1
        for(idx in 1..(nums.lastIndex)){
            if(baseNum != nums[idx]){
                if(cntHeap.size < k){
                    cntHeap.add(nums[idx-1] to count)
                } else{
                    if(cntHeap.peek().second < count){
                        cntHeap.poll()
                        cntHeap.add(nums[idx-1] to count)
                    }
                }
                count = 1
                baseNum = nums[idx]
            } else{
                count++
            }
        }

        if(cntHeap.size < k){
            cntHeap.add(baseNum to count)
        } else{
            if(cntHeap.peek().second < count){
                cntHeap.poll()
                cntHeap.add(baseNum to count)
            }
        }

        val answer = mutableListOf<Int>()
        while(cntHeap.isNotEmpty()){
            val (num, count) = cntHeap.poll()
            answer.add(num)
        }
        return answer.toIntArray()
    }
}
