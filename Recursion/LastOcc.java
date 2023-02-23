public class LastOcc {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,2,3,0,4,3};
        System.out.println(findIdx(arr,arr.length-1,3));
    }

    // Finding last index when stack is going up or under pre region =>
    public static int findIdx(int[] arr,int idx,int ele){
        if(idx==-1)return idx;
        return arr[idx]==ele ? idx : findIdx(arr, idx-1, ele);
    }

    // Finding last index stack fall time or under post region =>
    public static int getIdx(int[] arr,int idx,int ele){
        if(idx==-1)return idx;
        int ans=getIdx(arr,idx-1,ele);
        return arr[idx]==ele ? idx : ans;
    }
}
