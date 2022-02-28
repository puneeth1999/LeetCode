class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        if(len(nums) < 1):
            return []
        if(len(nums) == 1):
            return [str(nums[0])]
        i = 0 
        j = 1
        res = []
        while(j < len(nums)):
            if(nums[j] != nums[j-1]+1):
                if(i < j-1):
                    rng = str(nums[i]) + "->" + str(nums[j-1])
                else:
                    rng = str(nums[j-1])
                res.append(rng)
                i = j
            j += 1

        if(i < j-1):
            rng = str(nums[i]) + "->" + str(nums[j-1])
            res.append(rng)
        else:
            rng = str(nums[j-1])
            res.append(rng)

        return res