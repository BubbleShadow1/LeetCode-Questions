import java.util.ArrayList;

public class partitioninksubsets {
    public boolean isKPartitionPossible(int n, int k)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
	for(int i=0;i<k;i++)
    {
        ans.add(new ArrayList<>());
    }
return parition(0, n, k,1, ans,0);
    }
    public boolean parition(int i,int n,int k,int nos,ArrayList<ArrayList<Integer>>ans,int u)
    {
        if(i>=n)
        {
            if(nos==k)
            {
u=5;
return true;

            }
        }
        

        
            for(int j=0;j<k;j++)
            {
                if(ans.get(j).size()>0)
                {
                    ans.get(j).add(i);
                    parition(i+1, n, k, nos, ans,u);
                ans.get(j).remove(ans.get(j).size()-1);
                }
                else{
                    ans.get(j).add(i);
                    parition(i+1, n, k, nos+1, ans,u);
                    ans.get(j).remove(ans.get(j).size()-1);
                    break;
                }

            }       
return u==5?true:false;
    }
    
}
