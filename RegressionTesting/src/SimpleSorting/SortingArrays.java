package SimpleSorting;

public class SortingArrays {
    public static void main(String[] args) {
        int[] t1 = {33,22,11,55,44};
        display(t1);
        System.out.println("Running Insertion Sort");
        insertionSort(t1);
        display(t1);
        line();

        int[] t2 = {33,22,11,55,44};
        display(t2);
        System.out.println("Running Bubble Sort");
        bubbleSort(t2);
        display(t2);
        line();

        int[] t3 = {33,22,11,55,44};
        display(t3);
        System.out.println("Running Selection Sort");
        selectionSort(t3);
        display(t3);
        line();
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void line() {
        System.out.println("-----------------------------------");
    }

    public static void insertionSort(int[] arr)  {
        int temp, in;
        for(int out = 1; out < arr.length; out++) {
            temp = arr[out];
            in = out;
            while(in > 0 && arr[in-1] > temp) {
               arr[in] = arr[in-1];
               in--;
            }
            arr[in] = temp;
        }
    }

   public static void bubbleSort(int[] arr) {
        for(int out = arr.length-1; out > 0; out--) {
            for(int in = 1; in < arr.length; in++) {
                if(arr[in-1] > arr[in]) {
                    swap(arr, in, in-1);
                }
            }
        }
   }

   public static void selectionSort(int[] arr) {
        int min;
        for(int out = 0; out < arr.length-1; out++) {
            min = out;
            for(int in = out+1; in < arr.length; in++) {
                if(arr[in] < arr[min]) {
                    min = in;
                }
            }
            swap(arr, min, out);
        }
   }

   public static void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
   }
}
