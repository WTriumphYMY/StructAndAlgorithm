package cn.edu.nwpu.datastruct;

/**
 * @ClassName AbstractADT
 * @Author: wkx
 * @Date: 2021/1/16 16:11
 * @Version: v1.0
 * @Description: 线性表
 */
public abstract class AbstractADT<T> {
    protected int length;

    public int getLength(){
        return length;
    }

    public abstract int locateElem(T t);

    public abstract T getElem(int i);

    public abstract boolean listInsert(int i, T t);

    public abstract T listDelete(int i);

    public abstract void printList();

    public boolean empty(){
        if (length<=0)
            return true;
        return false;
    }

    public abstract void destroyList();
}
