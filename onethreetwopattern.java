import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class onethreetwopattern {
    public static boolean find132pattern(int[] nums) {
     
// List<Integer> ar=new ArrayList<>();
// HashMap<Integer,Integer> hm=new HashMap<>();
// for(int i=0;i<nums.length;i++)
// {
// hm.put(nums[i],i);
// ar.add(nums[i]);
// }
// Arrays.sort(nums);

//    int i=0,j=1,k=2;
//         while(k<nums.length)
//         {
//             // if(k==nums.length) k=0;
//             // if(j==nums.length) j=0;
// if(nums[i]<nums[j] && nums[j]<nums[k])
// {
//     if(hm.get(nums[i]) <hm.get(nums[k]) && hm.get(nums[k])<hm.get(nums[j])) return true; 
// }
// i++;
// j++;
// k++;

//         }




//         return false;
Stack<Integer> st=new Stack<>();
int third=Integer.MIN_VALUE;
for(int i=nums.length-1;i>=0;i--)
{
    if(third>nums[i]) return true;
while(!st.empty() && st.peek()<nums[i])
{
    third=st.pop();
}
st.push(nums[i]);
}



return false;
    }

    public static void main(String args[])
    {
        int nums[]={1,2,3,4};
        System.out.println(find132pattern(nums));
    }
    
}
