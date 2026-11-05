class Solution {

    fun encode(strs: List<String>): String {
        val result = buildString {
            for(str in strs){
                append("${str.length}#$str")
            }
        }
        return result
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var idx = 0
        while(idx < str.length){
            val char = str[idx]
            var cursor = idx
            while(cursor < str.length && '0' <= str[cursor] && '9' >= str[cursor]) cursor++
            val lengthDecoded = str.slice(idx..<cursor).toInt()
            idx = cursor + 1
            val decoded = str.slice(idx..<(idx+lengthDecoded))
            idx += lengthDecoded
            result.add(decoded)
        }
        return result
    }
}
