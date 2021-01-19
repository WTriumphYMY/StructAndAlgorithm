package cn.edu.nwpu.struct;

import cn.edu.nwpu.datastruct.AbstractADT;
import cn.edu.nwpu.datastruct.SequenceList;
import org.junit.Test;

/**
 * @ClassName SequenceListTest
 * @Author: wkx
 * @Date: 2021/1/19 21:47
 * @Version: v1.0
 * @Description: ≤‚ ‘À≥–Ú±Ì
 */
public class SequenceListTest {

    @Test
    public void sequenceListTest(){
        AbstractADT<Integer> adt = new SequenceList<>();

        adt.listInsert(0, 1);
        adt.listInsert(0, 2);
        adt.listInsert(0, 3);
        adt.listInsert(0, 4);
        adt.listInsert(0, 5);
        adt.listInsert(0, 6);
        adt.listInsert(0, 7);
        System.out.println(adt.listDelete(3));
        adt.printList();
    }
}
