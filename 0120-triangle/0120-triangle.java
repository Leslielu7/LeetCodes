class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int result = Integer.MAX_VALUE;
        List<List<Integer>> memo = new ArrayList<List<Integer>>(triangle.size());
        
        
        for (int rowSize = 0; rowSize< triangle.size(); rowSize++){
            memo.add(new ArrayList<Integer>(rowSize+1));
        }
         
        for (int colStart = 0; colStart < triangle.size() ; colStart++){
            result = Math.min(result, findMinPath(triangle, 0, colStart, memo) );
        }
        
        return result;
    }
    
    public int findMinPath( List<List<Integer>> triangle, int row, int col, List<List<Integer>> memo){
            
        
            //BASE CASE
            if(col >= triangle.get(row).size()){
                return Integer.MAX_VALUE;
            }
            
            if(row == triangle.size()-1){
                return triangle.get(row).get(col);
            }
            if(memo.get(row).size() > 0){
                if(col < memo.get(row).size()){
                    return memo.get(row).get(col);
                }
            }
        
            int left =  findMinPath(triangle, row+1, col, memo);
            int right = findMinPath(triangle, row+1, col+1, memo);
            memo.get(row).add(Math.min(left, right)+triangle.get(row).get(col));
        
            return memo.get(row).get(col);
            
        }
    
}