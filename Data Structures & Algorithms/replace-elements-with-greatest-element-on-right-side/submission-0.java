class Solution {
    public int[] replaceElements(int[] arr) {
        int largest = -1;
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int pivot = arr[i];

            for(int j=i+1;j<n;j++){
                if(largest < arr[j]){
                    largest = arr[j];
                }
            }
            
            arr[i] = largest;
            largest = 0;
        }
        arr[n-1] = -1;

        return arr;
    }
}