public class uniquepath {
    static int path=0;
    public int uniquePaths(int m, int n) {
        int i=0,j=0;
        uniquePathshelp(m, n, i, j);
return path;
    }
    public void uniquePathshelp(int m, int n,int i,int j) {
        if(i==m && j==n) {path++; return ;}
        if(i+1<=m) uniquePathshelp(m, n,i+1,j);
        if(j+1<=n) uniquePathshelp(m, n, i, j+1);
    }
    
    
}
