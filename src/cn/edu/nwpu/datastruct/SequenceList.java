package cn.edu.nwpu.datastruct;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SequenceList
 * @Author: wkx
 * @Date: 2021/1/16 16:39
 * @Version: v1.0
 * @Description: 线性表的顺序表实现方式
 */
public class SequenceList<T> extends AbstractADT<T> {
    private Object[] objs;
    private final int DEFAULT_CAPACITY = 10;

    public SequenceList() {
        length = 0;
        objs = new Object[DEFAULT_CAPACITY];
        List list = new ArrayList();
    }


    @Override
    public int locateElem(Object o) {
        for (int i=0; i<length; i++){
            if (objs[i] == o)
                return i;
        }
        return -1;
    }

    @Override
    public T getElem(int i) {
        if (i>=length)
            return null;
        else
            return (T) objs[i];
    }

    @Override
    public boolean listInsert(int i, Object o) {
        if (i>length || length == DEFAULT_CAPACITY){
            System.err.println("已满");
            return false;
        }

        for (int j = length;j>i; j--){
            objs[j] = objs[j-1];
         }
        objs[i] = o;
        length++;
        return true;
    }

    @Override
    public T listDelete(int i) {
        if (this.empty()){
            System.err.println("list为空");
            return null;
        }
        if (i>=length){
            System.err.println("越界");
            return null;
        }
        Object ret = objs[i];
        for (;i<length-1;i++)
            objs[i] = objs[i+1];
        objs[i] = null;
        length--;

        return (T) ret;
    }

    @Override
    public void printList() {
        if (length == 0)
            return;

        for (int i = 0; i < length; i++) {
            System.out.println(getElem(i));

        }
    }

    @Override
    public void destroyList() {
        objs = new Object[DEFAULT_CAPACITY];
        length = 0;
    }
}
