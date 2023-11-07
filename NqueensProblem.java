import java.util.ArrayList;
import java.util.List;

public class NqueensProblem {
  public boolean isSafe(int row,int col, char board[][])
  {
    //horizontal
    for(int j=0;j<board.length;++j)
    {
       if(board[row][j]=='Q')
       {
        return false;
       } 
    }

    //vertical
    for(int j=0;j<board.length;j++)
    {
        if(board[j][col]=='Q')
        {
            return false;
        }
    }
    //upper right
    int r=row;
    for(int c=col;col<board.length && r>=0; r--,c++)
    {
        if(board[r][c]=='Q')
        {
            return false;
        }
    }
     r=row;
    for(int c=col;c>=0 && r>=0;c--,r-- )
    {
       if(board[r][c]=='Q')
       {
        return false;
       }  
    }

    //lower left
    int c=col;
    for(int r1=row; r1<board.length && c>=0 ; c--, r++)
    {
        if(board[r1][c]=='Q')
        {
            return false;
        }
    }
//lower right

c=col;
for(int r1=row;r1<board.length && c<board.length ; c++,r1++)
{
if(board[r1][col]=='Q')
{
    return false;
}
}
return true;
  }
  
  
    public void helper(char [][]board, List<List<String>>allboards,int col)
{
    if(col==board.length)
    {
        saveBoard(board,allboards);
        return;
    }
    for(int row=0;row<board.length;row++)
    {
         if(isSafe(row,col,board))
         {
           board[row][col]='Q'; 
         }
         helper(board,allboards,col+1);
    }
}


public List<List<String>> solveQueens(int n)
{
    List<List<String>> allboards=new ArrayList<>();
    char board[][]=new char[n][n];
    helper(board,allboards,0);
    return allboards;

}
public void saveBoard(char [][]board,List<List<String>> allBoards)
{
    String row="";
    List<String> newBoard=new ArrayList<>();
    for(int i=0;i<board.length;i++)
    {
        row="";
        for(int j=0;j<board[0].length;j++)
        {
            if(board[i][j]=='Q')
            {
                row+='Q';

            }
            else{
                row+='.';
            }
            newBoard.add(row);
        }
    }
}
}
