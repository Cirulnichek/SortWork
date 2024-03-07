import java.util.Random;

public class Main {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fill(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(arr.length);
        }
    }

    public static void bubble_sort(int[] arr) {
        System.out.println("Bubble sort has started");
        System.out.println("Array size: " + arr.length);
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Bubble sort has ended, time: " + (end - start));
        System.out.println();
    }

    public static void insert_sort(int[] arr) {
        System.out.println("Insert sort has started");
        System.out.println("Array size: " + arr.length);
        long start = System.currentTimeMillis();
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Insert sort has ended, time: " + (end - start));
        System.out.println();
    }

    public static void quick_sort(int[] arr, int low, int high) {
        if (arr.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }               
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quick_sort(arr, low, j);
        if (high > i)
            quick_sort(arr, i, high);
    }

    public static void main(String[] args) {
        Random random = new Random();
        {
            int[] arr = new int[100];
            fill(arr);
            printArr(arr);
            bubble_sort(arr);
            printArr(arr);
            System.out.println();

            int[] arr2 = new int[1000];
            fill(arr2);
            printArr(arr2);
            bubble_sort(arr2);
            printArr(arr2);
            System.out.println();

            int[] arr3 = new int[10000];
            fill(arr3);
            printArr(arr3);
            bubble_sort(arr3);
            printArr(arr3);
            System.out.println();
        }

        {
            int[] arr = new int[100];
            fill(arr);
            printArr(arr);
            insert_sort(arr);
            printArr(arr);
            System.out.println();

            int[] arr2 = new int[1000];
            fill(arr2);
            printArr(arr2);
            insert_sort(arr2);
            printArr(arr2);
            System.out.println();

            int[] arr3 = new int[10000];
            fill(arr3);
            printArr(arr3);
            insert_sort(arr3);
            printArr(arr3);
            System.out.println();
        }

        {
            int[] arr = new int[100];
            fill(arr);
            printArr(arr);
            System.out.println("Quick sort has started");
            System.out.println("Array size: " + arr.length);
            long start = System.currentTimeMillis();
            quick_sort(arr, 0, 99);
            long end = System.currentTimeMillis();
            System.out.println("Quick sort has ended, time: " + (end - start));
            System.out.println();
            printArr(arr);
            System.out.println();

            int[] arr2 = new int[1000];
            fill(arr2);
            printArr(arr2);
            System.out.println("Quick sort has started");
            System.out.println("Array size: " + arr2.length);
            start = System.currentTimeMillis();
            quick_sort(arr2, 0, 999);
            end = System.currentTimeMillis();
            System.out.println("Quick sort has ended, time: " + (end - start));
            System.out.println();
            printArr(arr2);
            System.out.println();

            int[] arr3 = new int[10000];
            fill(arr3);
            printArr(arr3);
            System.out.println("Quick sort has started");
            System.out.println("Array size: " + arr3.length);
            start = System.currentTimeMillis();
            quick_sort(arr3, 0, 9999);
            end = System.currentTimeMillis();
            System.out.println("Quick sort has ended, time: " + (end - start));
            System.out.println();
            printArr(arr3);
            System.out.println();
        }
    }
}