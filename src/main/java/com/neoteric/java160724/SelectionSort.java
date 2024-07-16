package com.neoteric.java160724;

public class SelectionSort {
    public void selectionSort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int index=i;
            for (int j=i+1; j<n;j++){
                if (arr[j]< arr[index]){
                    index=j;
                }
            }
            int minNo=arr[index];
            arr[index]=arr[i];
            arr[i]=minNo;

        }


    }

}
