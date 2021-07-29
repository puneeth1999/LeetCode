class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        i = maxx = 0
        seen  = set()
        for j in range(len(s)):
            c = s[j]
            while c in seen:
                seen.remove(s[i])
                i += 1
            seen.add(c)
            maxx = max(maxx, j-i+1)
            print(seen, maxx)
        return maxx
            