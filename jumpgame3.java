public class jumpgame3 {
    public static boolean canReach(int[] arr, int start) {
        boolean visited[]=new boolean[arr.length];
        return reach(arr, start, visited);
    
    }
    public static boolean reach(int arr[],int start,boolean visited[])
    {
        if(start>=arr.length || start<0 || visited[start]) return false;
        visited[start]=true;
        if(arr[start]==0)return true;

        return reach(arr,start+arr[start],visited) || reach(arr, start-arr[start], visited);

    }
    public static void main(String args[])
    {
    int arr[]={4,2,3,0,3,1,2};
    System.out.println(canReach(arr, 5));

    }
}
