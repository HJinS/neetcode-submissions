class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val asciiSumMap = mutableMapOf<String, MutableList<String>>()
        for(str in strs){
            val sortedStr = str.toCharArray().sorted().joinToString("")
            asciiSumMap.getOrPut(sortedStr) { mutableListOf<String>() }.add(str)
        }
        return asciiSumMap.values.toList()
    }
}
