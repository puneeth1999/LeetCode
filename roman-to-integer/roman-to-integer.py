class Solution:
    def romanToInt(self, s: str) -> int:
        normals = {
            'I':1,
            'V':5,
            'X':10,
            'L':50,
            'C':100,
            'D':500,
            'M':1000,
            'IV':4,
            'IX':9,
            'XL':40,
            'XC':90,
            'CD':400,
            'CM':900
        }
        specials = {
            'IV':4,
            'IX':9,
            'XL':40,
            'XC':90,
            'CD':400,
            'CM':900
        }
        res = 0
        i = 0
        while (i < len(s)-1):
            if s[i: i+2] in specials:
                res += normals[s[i: i+2]]
                print(s[i: i+2], res)
                i += 2
            else:
                res += normals[s[i]]
                print(s[i], res)
                i += 1
            
        if s[len(s)-2:len(s)] not in specials:
            res += normals[s[len(s)-1]]
            print(s[len(s)-1], res)
        print('===============')
        return res