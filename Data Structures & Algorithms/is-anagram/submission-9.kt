class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val cnts = IntArray(26)
        if(s.length != t.length) return false

        for(i in 0..<(s.length)){
            cnts[s[i] - 'a']++    
            cnts[t[i] - 'a']--
        }


        for(i in 0..<(cnts.size)){

            if(cnts[i] != 0) return false
        }
        return true
    }

}
