class Solution {

    fun encode(strs: List<String>): String {
        var resultStr = ""
        for(str in strs){
            resultStr += "${str.length}#$str"
        }
        return resultStr
    }

    fun decode(str: String): List<String> {
        var idx = 0
        val result = mutableListOf<String>()
        // println(str)
        while(idx < str.length){
            var end = idx
            while(str[end] != '#'){
                end++
            }
            // println("${str.slice(idx..<end)} $idx $end")
            val strLength = str.slice(idx..<end).toInt()
            idx = end + 1
            val decodedWord = str.slice(idx..<(idx+strLength))
            // println("${str.slice(idx..<end)} $idx ${idx+strLength-1} $decodedWord")
            result.add(decodedWord)
            idx += strLength
        }
        return result
    }
}
