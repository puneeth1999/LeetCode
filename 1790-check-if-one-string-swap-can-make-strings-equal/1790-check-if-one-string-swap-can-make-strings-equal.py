class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        if len(s1) != len(s2):
            return False
        
        count = 0
        idx1 = -1
        idx2 = -1
        for i in range(len(s1)):
            if(s1[i] != s2[i]):
                count+=1
                if idx1 == -1:
                    idx1 = i
                else:
                    idx2 = i
        if count == 1:
            return False
        if count > 2:
            return False
        if count == 2:
            if(s1[idx1]+s1[idx2] == s2[idx2]+s2[idx1]):
                return True
            else:
                return False
        return True
            
            