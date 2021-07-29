class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if needle == "":
            return 0
        elif haystack == "" and needle != "":
            return -1
        first_char = needle[0]
        for i in range(len(haystack)):
            if haystack[i] == first_char:
                if haystack[i:i+len(needle)] == needle:
                    return i
        return -1