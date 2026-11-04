class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val cnts = IntArray(26)
        if(s.length != t.length) return false

        for (char in s) {
            cnts[char.code - 'a'.code]++
        }

        for (char in t) {
            val idx = char.code - 'a'.code
            if (cnts[idx] == 0) return false
            cnts[idx]--
        }
        
        return true
    }

}
