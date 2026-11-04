class Solution {

    val strDeque = ArrayDeque<Pair<Int, Int>>()

    fun encode(strs: List<String>): String {
        var result: String = ""
        var idx = 0
        for(str in strs){
            result = result + str
            strDeque.addLast(idx to idx + str.lastIndex)
            idx += (str.length)
        }
        return result
    }

    fun decode(str: String): List<String> {
        var numIdx: Int = 0
        val result = mutableListOf<String>()
        while(strDeque.isNotEmpty()){
            val (start, end) = strDeque.removeFirst()
            result.add(str.slice(start..end))
        }
        return result
    }
}
