class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        first = strs[0]
        for i in range(1, len(strs)):
            comp = strs[i]
            while first != comp:
                if len(first) > len(comp):
                    first = first[:-1]
                elif len(first) < len(comp):
                    comp = comp[:-1]
                else:
                    first = first[:-1]
                    comp = comp[:-1]
                print(first, comp)
            print('=====================')
        return first
                