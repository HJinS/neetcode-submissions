class Solution {

    fun encode(strs: List<String>): String {
        var resultStr = StringBuilder()
        for(str in strs){
            resultStr.append("${str.length}#$str")
        }
        return resultStr.toString()
    }

    fun decode(str: String): List<String> {
        var idx = 0
        val result = mutableListOf<String>()
        while(idx < str.length){
            var end = idx
            while(str[end] != '#'){
                end++
            }
            val strLength = str.substring(idx, end).toInt()
            idx = end + 1
            val decodedWord = str.substring(idx, idx+strLength)
            result.add(decodedWord)
            idx += strLength
        }
        return result
    }
}
