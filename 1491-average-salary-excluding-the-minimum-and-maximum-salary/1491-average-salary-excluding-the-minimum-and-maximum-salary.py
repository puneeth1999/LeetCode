class Solution:
    def average(self, salary: List[int]) -> float:
        # two pass approach
        mi = float('inf')
        ma = float('-inf')
        for i in salary:
            if i < mi:
                mi = i
            if i > ma:
                ma = i
        s = 0
        for sal in salary:
            if sal == mi or sal == ma:
                continue
            else:
                s += sal
        l = len(salary) - 2 #excluding min and max
        return float(s/l)
        
        