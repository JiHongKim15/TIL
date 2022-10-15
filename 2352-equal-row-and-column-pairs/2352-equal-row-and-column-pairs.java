class Solution {
    public int equalPairs(int[][] grid) {
        int answer = 0;

        HashMap<String, Integer> hs = new HashMap<>();
        for(int row=0; row<grid.length; row++){
            StringBuilder sb = new StringBuilder();
            for(int col=0; col<grid[row].length; col++){
                sb.append(grid[row][col] + ",");
            }
            if(hs.containsKey(sb.toString())){
                hs.put(sb.toString(), hs.get(sb.toString()) + 1);
            }else{
                hs.put(sb.toString(), 1);
            }
        }

        for(int col=0; col<grid.length; col++){
            StringBuilder sb = new StringBuilder();

            for(int row=0; row<grid[col].length; row++){
                sb.append(grid[row][col] + ",");
            }

            if(hs.containsKey(sb.toString())){
                answer += hs.get(sb.toString());
            }
        }


        return answer;
    }
}