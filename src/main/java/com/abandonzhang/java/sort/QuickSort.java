package com.abandonzhang.java.sort;

/**
 * @author zhangzhipeng02@meituan.com.
 * <p>
 * 2018/2/27.
 */
public class QuickSort {

    private static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void quickSort(int[] a,int i,int j){
        if(i >=  j){
            return;
        }
        int key = a[i];
        while (i < j){
            while (a[j] > key && i<j)
                j--;
            swap(a,i,j);

            while (a[i] < key && i<j)
                i++;
            swap(a,i,j);


        }
        quickSort(a,0,i-1);
        quickSort(a,i+1,j);
    }

    public static void main(String[] args) {
        int a[] = {5,1,3,4,6};
        quickSort(a, 0, 4);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
