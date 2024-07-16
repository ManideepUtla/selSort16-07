package com.neoteric.java160724;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForLoopTest {
    @Test
    public void sumOf500(){
        ForLoop loop=new ForLoop();
        int result = loop.sum(2,500);
        Assertions.assertEquals(1000,result);
    }

    @Test
    public void sumOf200(){
        ForLoop loop=new ForLoop();
        int result = loop.sum(5,200);
        Assertions.assertEquals(1000,result);

    }
    @Test
    public void sumOf100(){
        ForLoop loop=new ForLoop();
        int result=loop.sum(10,100);
        Assertions.assertEquals(1000,result);

    }


    @Test
    public void sort(){
        int[] arr={7,5,3,9,2,6};
        int[] exparr={2,3,5,6,7,9};
        SelectionSort sort=new SelectionSort();
        sort.selectionSort(arr);
        Assertions.assertArrayEquals(exparr,arr);
    }




}
