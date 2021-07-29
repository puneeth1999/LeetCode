class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        i = max_ = 0
        seen = set()
        for j in range(len(s)):
            c = s[j]
            while c in seen:
                seen.remove(s[i])
                i += 1
            seen.add(s[j])
            max_ = max(max_, j-i+1)
        return max_
        