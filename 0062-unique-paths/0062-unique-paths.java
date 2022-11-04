class Solution {
    public int uniquePaths(int m, int n) {
        //m: row, n: col
        int[][] dp = new int[m][n];

//         //top down
//         //initialize row#0 & col#0
//         for (int i=0; i<m; i++){
//             dp[i][0] = 1;
//         }
        
//         for (int j=0; j<n; j++){
//             dp[0][j] = 1;
//         }
        
//         //function
//         for(int i=1; i<m; i++){
//             for(int j=1; j<n; j++){
//                 dp[i][j] = dp [i-1][j] +  dp [i][j-1];
//             }
//         }
        
//         //ans
//         return dp[m-1][n-1];
        
        //bottom up
        //initialize row#0 & col#0
        for (int i=0; i<m; i++){
            dp[i][n-1] = 1;
        }
        
        for (int j=0; j<n; j++){
            dp[m-1][j] = 1;
        }
        
        //function
        for(int i= m-2; i>=0; i--){
            for(int j=n-2; j>=0; j--){
                dp[i][j] = dp [i+1][j] +  dp [i][j+1];
            }
        }
        
        //ans
        return dp[0][0];
        
    }
}