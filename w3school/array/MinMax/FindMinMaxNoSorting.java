package w3resource.array.MinMax;

public class FindMinMaxNoSorting {
    public static void main(String[] args) {
        // Declare and initialize an integer array 'my_array'.
        int[] my_array = {0, 6, 9, 0, 7, 7, 9};
        int[] arr = {-5, -2, -9};
        // Call the max_min method to calculate the maximum and minimum values.
        max_min(my_array);
        max_min2(arr);

    }
//pairwise = less comparison( using 2 numbers instead of 1 )
    private static void max_min(int[] arr) {
    int min = arr[0];
    int max = arr[0];
    int length = arr.length;
    for (int i = 1; i < arr.length; i+=2) {
        if(i+1 > length){
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
        }
        if(arr[i] > arr[i+1]){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i+1] < min){
                min = arr[i+1];
            }
        }
        if(arr[i] < arr[i+1]){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i+1] > max){
                max = arr[i+1];
            }
        }
    }
    System.out.println(min + " :min value " + max+ ": max value " );
    }
    private static void max_min2(int[] arr) {
    int min = arr[0];
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }else if(arr[i] < min){
                min = arr[i];
            }
    }
    System.out.println(min + " :min value " + max+ ": max value " );
    }
}
