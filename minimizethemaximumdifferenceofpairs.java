import java.util.Arrays;

class minimizethemaximumdifferenceofpairs{
    public static int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        
        int left = 0, right = nums[nums.length - 1] - nums[0];
        
        while (left < right) {
            int mid = (left + right) / 2;
              System.out.println(mid+"in starting mid");
            if (can_form_pairs(nums, mid, p)) {
                  System.out.println(right+"right ");
                right = mid;
            } else {
                  System.out.println(left+",,");
                    System.out.println(mid+"mid");
                left = mid + 1;
            }
        }
        System.out.println(left);
        return left;
    }
    
    private static boolean can_form_pairs(int[] nums, int mid, int p) {
        int count = 0;
        for (int i = 0; i < nums.length - 1 && count < p;) {
            if (nums[i+1] - nums[i] <= mid) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count >= p;
    }
    public static void main(String args[])
    {
        int arr[]={10,1,2,7,1,3};
        System.out.println(minimizeMax(arr, 2));
    }
}