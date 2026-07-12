class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int[][] ans = new int[rows * cols][2];

        int index = 0;

        int r = rStart;
        int c = cStart;

        ans[index++] = new int[]{r, c};

        int steps = 1;

        while (index < rows * cols) {

            // Right
            for (int i = 0; i < steps; i++) {
                c++;
                if (r >= 0 && r < rows && c >= 0 && c < cols)
                    ans[index++] = new int[]{r, c};
            }

            // Down
            for (int i = 0; i < steps; i++) {
                r++;
                if (r >= 0 && r < rows && c >= 0 && c < cols)
                    ans[index++] = new int[]{r, c};
            }

            steps++;

            // Left
            for (int i = 0; i < steps; i++) {
                c--;
                if (r >= 0 && r < rows && c >= 0 && c < cols)
                    ans[index++] = new int[]{r, c};
            }

            // Up
            for (int i = 0; i < steps; i++) {
                r--;
                if (r >= 0 && r < rows && c >= 0 && c < cols)
                    ans[index++] = new int[]{r, c};
            }

            steps++;
        }

        return ans;
    }
}