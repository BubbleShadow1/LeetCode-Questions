public class uniquePaths2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        uniquePathsWithObstacles1(obstacleGrid,0,0);
     return count;
    }
 static int count=0;
    public static void uniquePathsWithObstacles1(int[][] obstacleGrid,int i, int j) {
        if(obstacleGrid.length-1==i && obstacleGrid.length-1==j)
        {
            count++;
            System.out.println(count+"=count,i="+i+"j="+j);
return;
        }
        if(check(i,j,obstacleGrid.length,obstacleGrid))
        {
            if(j+1<=obstacleGrid.length-1){
                 uniquePathsWithObstacles1(obstacleGrid, i, ++j);
                 }
            if(i+1<=obstacleGrid.length-1){
                 uniquePathsWithObstacles1(obstacleGrid, ++i, j); }
            }
            return ;
         }
 static Boolean check(int i,int j,int n,int obstacleGrid[][])
 {
    if(i>n-1 || j>n-1 || i<0 || j<0 || obstacleGrid[i][j]==1)
    {
        return false ;
    }
    return true;
 }
 public static void main(String args[])
 {
int [][]arr={{0,1},{0,0}};
// System.out.println(arr.length);
System.out.println(uniquePathsWithObstacles(arr));
System.out.println(count);


 }
    
}
