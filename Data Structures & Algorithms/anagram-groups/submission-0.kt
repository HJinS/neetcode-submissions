class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groups = mutableMapOf<Map<Char, Int>, MutableList<String>>()
        for(str in strs){
            val charCnts = getCharCntMaps(str)
            groups.getOrPut(charCnts) { mutableListOf() }.add(str)
        }
        return groups.values.toList()
    }

    fun getCharCntMaps(str: String): Map<Char, Int>{
        val result = mutableMapOf<Char, Int>()
        for(idx in 0..<(str.length)){
            val char = str[idx]
            result[char] =result.getOrDefault(char, 0) + 1
        }
        return result
    }
}
