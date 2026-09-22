public class CountingSort {

    public static void main(String[]args){
        int arr[] = {4, 2, 2, 8, 3, 3, 1};
        int max = arr[0];

        for (int i = 1; i< arr.length; i++){
            
            if(arr[i]> max){
                max = arr[i];
            }
        }
        int[] count = new int [max + 1];

        for (int i = 0; i< arr.length; i++){
            count[arr[i]]++;
        }

        int index = 0;
        
        for (int i = 0; i<= max; i++){
            while (count[i] > 0){
                arr[index]= i;
                index ++;
                count[i]--;


            }
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }
    }

    
    
}
