class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        // base case: row #1 of the triangle
        result.add(new ArrayList<>());
        result.get(0).add(1);
        
        //start building the triangle from row #2
        for (int row = 1; row < numRows; row ++){
            List<Integer> currentRow = new ArrayList<Integer>();
            currentRow.add(1);
      
            for(int col = 1; col < row;  col ++){
                currentRow.add(result.get(row-1).get(col-1) + result.get(row-1).get(col));
               
            }
            
            currentRow.add(1);
            result.add(currentRow);
        }
         return result;
    }
}