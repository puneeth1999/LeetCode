class Solution:
    def arraySign(self, nums: List[int]) -> int:
        neg = 0
        for num in nums:
            if num == 0:
                return 0
            if num < 0:
                neg+=1
        if neg%2 == 0:
            return 1
        return -1
        