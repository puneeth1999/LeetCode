class Solution:
    def nearestValidPoint(self, x: int, y: int, points: List[List[int]]) -> int:
        sDist = float("inf")
        idx = -1
        valid = False
        for i in range(len(points)):
            currDist = self.manhattan([x,y], points[i])
            if (currDist < sDist and (x == points[i][0] or y == points[i][1])):
                sDist = currDist
                idx = i
                valid = True
        if valid:
            return idx
        return -1
    
    def manhattan(self, A, B):
        return abs(A[0] - B[0]) + abs(A[1] - B[1])