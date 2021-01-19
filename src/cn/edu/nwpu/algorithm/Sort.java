package cn.edu.nwpu.algorithm;

/**
 * @ClassName Sort
 * @Author: wkx
 * @Date: 2019/3/21 20:49
 * @Version: v1.0
 * @Description:
 */
public class Sort {

    /**
     * 插入排序
     * @param x
     * @return
     */
    public int[] insertionSorting(int[] x){
        for (int i = 1; i < x.length; i++){
            for (int j = 0; j < i; j++){
                if (x[i] < x[j]){
                    int temp = x[j];
                    x[j] = x[i];
                    x[i] = temp;
                }
            }
        }
        return x;
    }

    /**
     * 希尔排序
     * @param x
     * @return
     */
    public int[] shellSorting(int[] x){
        int gap = x.length/2;
        while ((gap /=2) > 0){
            for (int i = 0; i < gap; i++){
                for (int j = i+gap; j < x.length; j+=gap){
                    if (x[i] < x[j]){
                        int temp = x[j];
                        x[j] = x[i];
                        x[i] = temp;
                    }
                }
            }
        }
        return x;
    }

    /**
     * 选择排序
     * @param x
     * @return
     */
    public int[] selectionSorting(int[] x){
        for (int i = 0; i < x.length; i++){
            int min = i;
            for (int j = i+1; j<x.length; j++){
                if (x[min] > x[j])
                    min = j;
            }
            int temp = x[i];
            x[i] = x[min];
            x[min] = temp;
        }
        return x;
    }

    /**
     * 堆排序
     * @param x
     * @return
     */
    public int[] heapSorting(int[] x){

        return x;
    }

    /**
     * 快速排序
     * @param x
     * @param left
     * @param right
     * @return
     */
    public int[] quickSorting(int[] x, int left, int right){
        int dp;
        if (left < right){
            dp = partiton(x, left, right);
            quickSorting(x, left, dp-1);
            quickSorting(x, dp+1, right);
        }
        return x;
    }
    private int partiton(int[] x, int left, int right){
        int pivot = x[left];
        while (left < right){
            while (left < right && x[right] > pivot)
                right--;
            if (left < right){
                x[left++] = x[right];
            }
            while (left < right && x[left] < pivot)
                left++;
            if (left < right){
                x[right--] = x[left];
            }
        }
        x[left] = pivot;
        return left;
    }

    public int[] bubbleSort(int[] x){
        for (int i=x.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (x[j]>x[j+1]){
                    int temp = x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        return x;
    }

    public static void selectionSort(Comparable[] a){
        for (int i=0; i<a.length; i++){
            int min = i;
            for (int j=i+1; j<a.length; j++){
                if (less(a[j], a[min]))
                    min=j;
            }
            exchange(a,i, min);
        }
    }

    public static void insertionSort(Comparable[] a){

    }

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void exchange(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static boolean isSorted(Comparable[] a){
        for (int i=1; i<a.length; i++){
            if ( less(a[i], a[i-1]))
                return false;
        }
        return true;
    }
}
