package lql.algorithm.sort.test;

import lql.algorithm.sort.Insertion;
import lql.algorithm.sort.Selection;

import java.util.Arrays;

/**
 * @author lql
 * @version 1.0.0
 * @ClassName InsertionTest.java
 * @Description TODO
 * @createTime 2022年04月21日 20:44
 */


public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
