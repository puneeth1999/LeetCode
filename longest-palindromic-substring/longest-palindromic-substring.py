class Solution:
    def longestPalindrome(self, s: str) -> str:
        start = 0
        end = 0
        for i in range(len(s)):
            '''
            Two scenarios here:
                1. string with odd length
                2. string with even length
            '''
            len1 = expandFromMiddle(s, i, i) # For the first scenario
            len2 = expandFromMiddle(s, i, i+1) # For the second scenario
            # If we applied one case for another scenario, we will get a shorter len than the right answer
            # So...
            actual_len = max(len1, len2)
            if actual_len > end - start:
                start = i - ((actual_len-1) // 2)
                end = i + (actual_len // 2)
                
        return s[start : end+1]

        
def expandFromMiddle(s, left, right):
    if s == None or len(s) <= 0:
        return 0
    while left >= 0 and right < len(s) and s[left] == s[right]:
        left -= 1
        right += 1
    # Return len of the substring
    # 'a a b b a d'
    # '0 1 2 3 4 5' => 5 - 0 = 5; 5 -  1 = 4
    return right - left - 1


            
        
            