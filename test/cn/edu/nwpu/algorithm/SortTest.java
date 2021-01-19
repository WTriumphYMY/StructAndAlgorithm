package cn.edu.nwpu.algorithm;


import org.junit.Test;


public class SortTest {

    Sort sort = new Sort();

    @Test
    public void testInsertionSorting(){
        int[] x = {2,3,5,1,23,6,78,34,23,4,5,78,34,65,32,65,76,32,76,1,9};

        System.out.println("-----插入排序------");
        long startTime = System.nanoTime();
        for (int v : sort.insertionSorting(x)) {
            System.out.print(v+"\t");
        }
        long endTime = System.nanoTime();
        System.out.println("插入排序时间为：" + (endTime-startTime));

        System.out.println("-----Shell排序------");
        startTime = System.nanoTime();
        for (int v : sort.shellSorting(x)) {
            System.out.print(v+"\t");
        }
        endTime = System.nanoTime();
        System.out.println("Shell排序时间为：" + (endTime-startTime));

        System.out.println("-----快速排序------");
        startTime = System.nanoTime();
        for (int v : sort.quickSorting(x, 0, x.length-1)) {
            System.out.print(v+"\t");
        }
        endTime = System.nanoTime();
        System.out.println("快速排序时间为：" + (endTime-startTime));

//        System.out.println("-----选择排序------");
//        startTime = System.nanoTime();
//        for (int v : sort.selectionSorting(x)) {
//            System.out.println(v);
//        }
//        endTime = System.nanoTime();
//        System.out.println("选择排序时间为：" + (endTime-startTime));
    }

    @Test
    public void testBubbleSort(){
        int[] x = {2,3,5,1,23,6,78,34,23,4,5,78,34,65,32,65,76,32,76,1,9};
        x=sort.bubbleSort(x);
        for (int a : x)
            System.out.print(a+" ");

    }
}