public class Hindex {
    public int hIndex(int[] citations) {
        int count[]=new int[citations.length];
        int k=0;
    for(int i=0;i<citations.length;i++)
      {
        for(int j=1;j<=citations[i];j++)
        {
            if(j<citations.length) count[j]++;
            if(j>=citations.length)break;
        }    
    }


    for(int i=0;i<citations.length;i++)
    {
        if(i==count[i])return i;
    }
    return -1;
    }
}
