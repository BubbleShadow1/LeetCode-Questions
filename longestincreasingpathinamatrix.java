public class longestincreasingpathinamatrix {
    public int longestIncreasingPath(int[][] matrix) {
        int max = 0;
        int numRows = matrix.length;
        if (numRows == 0) return 0;
        int numCols = matrix[0].length;
        boolean[][] visited = new boolean[numRows][numCols];
    int mem[][]=new int[201][201];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                int pathLength = dfs(matrix, i, j, visited, Integer.MIN_VALUE,mem);
                max = Math.max(max, pathLength);
            }
        }
    
        return max;
    }
    
    private int dfs(int[][] matrix, int i, int j, boolean[][] visited, int prev,int mem[][]) {
    
        int numRows = matrix.length;
        int numCols = matrix[0].length;
    
        if (i < 0 || i >= numRows || j < 0 || j >= numCols || visited[i][j] || matrix[i][j] <= prev) {
            return 0;
        }
    if(mem[i][j]>0)
    {
        return mem[i][j];
    }
        visited[i][j] = true;
        int left = dfs(matrix, i, j - 1, visited, matrix[i][j],mem);
        int right = dfs(matrix, i, j + 1, visited, matrix[i][j],mem);
        int up = dfs(matrix, i - 1, j, visited, matrix[i][j],mem);
        int down = dfs(matrix, i + 1, j, visited, matrix[i][j],mem);
    
        visited[i][j] = false;
    
    mem[i][j]=1 + Math.max(Math.max(left, right), Math.max(up, down));
        return 1 + Math.max(Math.max(left, right), Math.max(up, down));
    }
    public static void main(String args[])
    {

    }
}
