package LinearSearch.LinearSearchExamples;

public class LinearSearch {
    public static void main(String[] args) {
        int [] searchArray = new int[]{1,2,3,7,4,1};
        int element = 45;
        if(linearSearch(searchArray,element) == -1){
            System.out.println("Element wasn't found");
        }else{
            System.out.println("Element is found: "+linearSearch(searchArray,element));
        }

    }

    public static int linearSearch(int [] arr, int searchElement){
        for (int i = 0; i < arr.length;i++){
            if(searchElement == arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}
