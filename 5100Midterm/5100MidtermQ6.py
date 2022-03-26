class Solution():
	def longestSubstring():
		
        ans = 0
        
        
        dic = {}
        
        j = 0
        for i in range(len(s)):
            if s[i] in dic:
                j = max(j,dic[s[i]] + 1)
                
            dic[s[i]] = i
            ans = max(ans,i-j+1)
        
        return ans
