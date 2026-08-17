class BinarySearch{

    static int binarysearch(int []arr, int low, int high, int target){

        if(low>high){
            return -1;

        }
        int mid = low + (high - low )/2;


        if(arr[mid] == target){
            return mid;
        }
        if(target > arr[mid]){
            return binarysearch(arr, mid+1, high, target);
        }
        return binarysearch(arr, low, mid-1, target);

    }

    public static void main(String[]args){

        int []arr = {10,20,30,40,50};

        int target = 30;

        int result = binarysearch(arr, 0, arr.length-1, target);

        if(result != -1){
            System.out.println("Element found at index:"+result);
        }else{
            System.out.println("Element not found");
        }
    }
}