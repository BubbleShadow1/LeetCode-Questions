public class zeroonematrix {
    public static int[][] updateMatrix(int[][] mat) {
        int arr[][]=new int[mat.length][mat.length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(mat[i][j]==0)
                {
                    arr[i][j]=0;
                }
                else{
                    distance(i,j,mat,0,Integer.MAX_VALUE);
                    arr[i][j]=min;
                }


            }



        }

return arr;

    }

  static int min=Integer.MAX_VALUE;
public static int distance(int i, int j , int mat[][],int dis,int min)
{
    if(mat[i][j]==0){
       min=Math.min(dis, min);
        return min;
    }
    // System.out.println(i+""+j);
   System.out.println(i+""+j);
    if(i+1<mat.length-1) {   
      distance(i+1, j, mat,++dis,min);
      
    }
    if(j+1<mat.length-1){
        distance(i, j+1, mat,++dis,min);
    
    }

        if(i-1>0) {
            distance(i-1,j,mat,++dis,min);
        }
        if(j-1>0)
        {
            distance(i, j-1, mat,++dis,min);
        }
        

return min;

    }

    // static boolean check(int i,int j, int mat[][])
    // {
    //     if(i>mat.length-1 || j>mat.length-1 || i<0 || j<0)
    //     {
    //         return false;
    //     }
    //     return true;
    // }


    public static void main(String args[])
    {
        int mat[][]={{0,0,0},{0,1,0},{1,1,1}};
     mat=updateMatrix(mat);
     for(int i=0;i<mat.length;i++)
     {
        for(int j=0;j<mat.length;j++)
        {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
     }
    }
}




