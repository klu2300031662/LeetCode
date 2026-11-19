class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[] rows = new int[n];
        for(int i=0; i<n; i++){
            int ones = 0, zeros = 0;
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    ones++;
                }
                else{
                    zeros++;
                }
            }
            rows[i] = ones - zeros;
        }
        int[] cols = new int[m];
        for(int j=0; j<m; j++){
            int ones = 0, zeros = 0;
            for(int i=0; i<n; i++){
                if(grid[i][j] == 1){
                    ones++;
                }
                else{
                    zeros++;
                }
            }
            cols[j] = ones - zeros;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                grid[i][j] = rows[i] + cols[j];
            }
        }
        return grid;
    }
}