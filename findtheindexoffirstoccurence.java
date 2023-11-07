public class findtheindexoffirstoccurence {
    public static int strStr(String haystack, String needle) {
       
        int hLen = haystack.length();
            int nLen = needle.length();
            int nIndex = 0;
            for(int i=0; i<hLen; i++){
                // as long as the characters are equal, increment needleIndex
                if(haystack.charAt(i)==needle.charAt(nIndex)){
                    nIndex++;
                    System.out.println(nIndex+"nindex when equal");
                }
                else{
                    // start from the next index of previous start index
                    i=i-nIndex;
                    // needle should start from index 0
                    nIndex=0;
                     System.out.println(i+"i when not equal ");
                }
                // check if needleIndex reached needle length
                if(nIndex==nLen){
                    // return the first index
                     System.out.println(nIndex+"when equal and return ");
                    return i-nLen+1;
                }
            }
            return -1;
        }
        public static void main(String args[])
        {
            String haystack="leetcode";
            String needle="leeto";
            System.out.println("fun+"+strStr(haystack,needle));
        }
}
