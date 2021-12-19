class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if(color != newColor)
            dfs(image, sr, sc, newColor, color);
        return image;
    }
    public void dfs(int[][] image, int r, int c, int newColor, int color){
        // The "if condition" below checks for the continuity of the path. 
        // If it's not the same as "color", path doesn't exist.
        if(image[r][c] == color){
            image[r][c] = newColor;
            // Lower Boundaries
            if(r > 0) dfs(image, r - 1, c, newColor, color);
            if(c > 0) dfs(image, r, c - 1, newColor, color);
            // Upper Boundaries
            if(r < image.length - 1) dfs(image, r + 1, c, newColor, color);
            if(c < image[0].length - 1) dfs(image, r, c + 1, newColor, color);
        }
    }
}