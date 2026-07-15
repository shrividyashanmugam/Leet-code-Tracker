// Last updated: 7/15/2026, 2:08:20 PM
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int row, int col) {
        // Boundary check
        if (row < 0 || col < 0 ||
            row >= grid.length || col >= grid[0].length ||
            grid[row][col] == '0') {
            return;
        }

        // Mark as visited
        grid[row][col] = '0';

        // Explore 4 directions
        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}