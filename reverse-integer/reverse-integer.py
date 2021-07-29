import math
class Solution:
    def reverse(self, x: int) -> int:
        upper = math.pow(2, 31) - 1
        lower = 0 - math.pow(2, 31)
        print(upper, lower)
        neg = False
        
        if x < 0:
            x = abs(x)
            neg = True
        x = int(str(x)[::-1])
        if x < lower or x > upper:
            x = 0
        if neg:
            return 0-x
        return x
        
        