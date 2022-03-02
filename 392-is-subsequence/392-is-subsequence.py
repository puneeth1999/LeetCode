class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if t == s or s == "":
            return True
        if(len(s) > len(t)):
            return False
        j = 0
        for i in range(len(t)):
            if j == len(s):
                break
            if s[j] == t[i]:
                j+=1
        if j == len(s):
            return True
        return False