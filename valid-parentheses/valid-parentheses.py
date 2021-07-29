class Solution:
    def isValid(self, s: str) -> bool:
        open_dic = {
            '(': ')',
            '[': ']',
            '{': '}'
        }
        close_dic = {
            ')': '(',
            ']': '[',
            '}': '{'
        }
        stack = []
        for i in range(len(s)):
            if s[i] in open_dic:
                stack.append(s[i])
            else:
                if len(stack) == 0:
                    return False
                value = close_dic[s[i]]
                v= stack.pop()
                if (value != v):
                    return False
        if len(stack) == 0:
            return True
        return False
        
        