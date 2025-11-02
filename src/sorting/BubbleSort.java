package sorting;

public class BubbleSort {
    
    public void bubbleSort(int[] arr){
        for (int i = arr.length-1; i >= 0 ; i--) {
            boolean flag = false;
            for(int j=0; j<i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    
    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {7,5,1,3,4,1,9};
        bs.bubbleSort(arr);
        bs.printArray(arr);
    }
    
}
