class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val cnts = IntArray(26)
        if(s.length != t.length) return false

        for(i in 0..<(s.length)){
            cnts[s[i] - 'a']++    
        }

        for(i in 0..<(t.length)){
            val idx = t[i] - 'a'
            if (cnts[idx] == 0) return false
            cnts[idx]--
        }
        
        return true
    }

}
