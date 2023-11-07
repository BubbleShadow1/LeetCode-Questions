import java.util.Arrays;
import java.util.HashMap;

public class findthewinnerofthearray {
     public int getWinner(int[] arr, int k) {
        // System.arraycopy(arr, 0, arr, k, k);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int p=hm.get(arr[i]);
                hm.put(arr[i],++p);
            }
            else{
                hm.put(arr[i],0);
            }

        }
    for(int i=0;i<arr.length;i++)
    {
        if(arr[0]<arr[1])
        {
            int big=arr[1];
            int small=arr[0];
            int o=hm.get(arr[1]);
            hm.put(arr[1],++o);
            if(++o>=k)return arr[1];
            arr=shifting(arr);
            arr[0]=big;
            arr[arr.length-1]=small;
        }
        else {
            int big=arr[0];
            int small=arr[1];
            int o=hm.get(big);
            hm.put(arr[1],++o);
            if(++o>=k)return arr[0];
            arr=shifting(arr);
            arr[0]=big;
            arr[arr.length-1]=small;
        }
    }
    return -1;
    }

    int[] shifting(int arr[])
    {
        int k=1;
        for(int i=2;i<arr.length;i++)
        {
            arr[k]=arr[i];
            k++;
        }
return arr;
    }
}
