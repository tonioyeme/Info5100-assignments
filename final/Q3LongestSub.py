class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # length of the substring
        ans = 0

        # use dictionary to store the character and the corresponding index
        dic = {}

        # iterate all the characters in the string, and append the chars into the dic
        j = 0  # j = left pointer of the searching window, i = right pointer of the searching window
        for i in range(len(s)):
            if s[i] in dic:
                j = max(j, dic[s[i]] + 1)

            dic[s[i]] = i
            ans = max(ans, i - j + 1)

        return ans