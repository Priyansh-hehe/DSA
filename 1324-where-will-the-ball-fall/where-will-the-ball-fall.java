class Solution {
    public int[] findBall(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[] ans = new int[n];

        for (int start = 0; start < n; start++) {

            int col = start;

            for (int row = 0; row < m; row++) {

                if (grid[row][col] == 1) {

                    if (col == n - 1 || grid[row][col + 1] == -1) {
                        col = -1;
                        break;
                    }

                    col++;

                } else {

                    if (col == 0 || grid[row][col - 1] == 1) {
                        col = -1;
                        break;
                    }

                    col--;
                }
            }

            ans[start] = col;
        }

        return ans;
    }
}