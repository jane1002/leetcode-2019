package google;

/**
 * link: https://leetcode.com/problems/max-increase-to-keep-city-skyline/
 */
class IncreaseSkyline807 {

    /**
     *
     * @param grid
     * @return the sum of increased number
     */
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int N = grid.length;
        int rowMax[] = new int[N];
        int colMax[] = new int[N];
        int sum = 0;

        // calculate skyline which is rowMax, colMax.
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                rowMax[j] = Math.max(rowMax[j], grid[i][j]);
                colMax[i] = Math.max(colMax[i], grid[i][j]);
            }
        }

        // calculate diff and sum
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int temp = grid[i][j];
                grid[i][j] = Math.min(rowMax[i], colMax[j]);
                sum = sum + grid[i][j] - temp;
            }
        }

        return sum;
    }
}