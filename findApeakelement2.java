public class findApeakelement2 {
   static int i=0,j=0;
public static int [] findPeakGrid(int [][]mat)
{
    findPeakGrid1(mat); 
    int arr[]={i,j};
    return arr;

}   
    public static boolean  findPeakGrid1(int[][] mat) {
        boolean b1=true,b2=true,b3=true,b4=true;
        if(i>=mat.length && j>=mat.length)
        {
           return true;
        }
        if(i<mat.length && j==mat.length) {i++; j=0;}
        if(j+1<mat.length) 
        {
            if(mat[i][j]<mat[i][j+1]) b1=false;
        }
      if(i+1<mat.length) 
        {
            if(mat[i][j]<mat[i+1][j]) b2=false;
        }
        if(j-1>-1) 
        {
            if(mat[i][j]<mat[i][j-1]) b3=false;
        }
        if(i-1>-1) 
        {
            if(mat[i][j]<mat[i-1][j]) b4=false;
        }
        if(b1 && b2 && b3 && b4)
        {
            return true;
        }
        else{
            j++;
            return findPeakGrid1(mat);
        }
    }
}