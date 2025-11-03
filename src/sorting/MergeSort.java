package sorting;

public class MergeSort {

    public void mergeSort(int[] arr){

    }

    public void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,4,1,5,6,1,2};
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr);
        ms.printArray(arr);

    }

}
