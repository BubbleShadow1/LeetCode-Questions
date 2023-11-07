import java.util.Arrays;
public class plusone {
  public static int[] plusOne(int[] digits) {
    int carry = 1;
    for(int i = digits.length-1; i >= 0; i--) {
        digits[i] += carry;
        carry = digits[i] / 10;
        digits[i] %= 10;
    }
    return digits;
    }
    public static void main(String args[])
    {
       int digits[] = {8,9,9,9};
       int arr[]=plusOne(digits);
       for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]);
       }
    }
    
}
