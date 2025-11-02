package sorting;

public class SelectionSort {

    public void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min = arr[i], index = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] arr = {7,3,1,1,4,5,2};
        ss.selectionSort(arr);
        ss.printArray(arr);
    }
}
