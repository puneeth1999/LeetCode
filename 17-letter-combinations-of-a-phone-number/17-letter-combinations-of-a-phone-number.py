class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if(len(digits) == 0):
            return []
        dic = {'2' : "abc", '3' : 'def', '4' : 'ghi', '5' : 'jkl', '6' : 'mno', '7' : 'pqrs', '8' : 'tuv', '9' : 'wxyz'};
        res = [""]
        for digit in digits:
            val = dic[digit]
            res = [x+y for x in res for y in val]
        return res