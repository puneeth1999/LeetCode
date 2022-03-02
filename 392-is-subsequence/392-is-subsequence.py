class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if t == s or s == "":
            return True
        if(len(s) > len(t)):
            return False
        j = 0
        i = 0
        while(j < len(s) and i < len(t)):
            if t[i] == s[j]:
                j += 1
            i += 1
        if j == len(s):
            return True
        return False