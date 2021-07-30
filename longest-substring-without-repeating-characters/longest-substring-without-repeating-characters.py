class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        i = _max = 0
        seen = set()
        for j in range(len(s)):
            c = s[j]
            while c in seen:
                seen.remove(s[i])
                i += 1
            seen.add(s[j])
            _max = max(_max, j-i+1)
        return _max
            
        