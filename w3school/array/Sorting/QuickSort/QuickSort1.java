package array.Sorting.QuickSort;

public class QuickSort1 {
    private int[] tempArray;
    private int len;
    public void sort(int[] arr) {
        len = arr.length;
        this.tempArray  = arr;
        quickSort(0,len-1);
    }

    private void quickSort(int start, int end) {
    int middleElement = tempArray[start + (end - start) / 2];

    int i = start;
    int j = end;
    while (i<=j) {
        while(tempArray[i]<middleElement){
            i++;
        }
        while(tempArray[j]>middleElement){
            j--;
        }
        if(i<=j){
            exchangeNumbers(i,j);
            i++;
            j--;
        }

    }

    if(start < j){
        quickSort(start,j);
    }
    if(i<end){
        quickSort(i,end);
    }

    }

    private void exchangeNumbers(int i, int j) {
    int temp = tempArray[i];
    tempArray[i] = tempArray[j];
    tempArray[j] = temp;
    }
}
