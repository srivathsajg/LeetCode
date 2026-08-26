class Solution {
    public int findMaxK(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for(int ele : arr){
        if(ele<0)
        set.add(ele);
    }
    int mx=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>0 && arr[i]>mx){
        if(set.contains(-arr[i]))
        mx=arr[i];
        }
    } 
    if(mx==Integer.MIN_VALUE) return -1;
    return mx; 
    }
}
