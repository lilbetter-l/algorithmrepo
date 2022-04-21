package lql.algorithm.sort.test;

import lql.algorithm.sort.Bubble;
import lql.algorithm.sort.Selection;

import java.util.Arrays;

/**
 * @author lql
 * @version 1.0.0
 * @ClassName SelectionTest.java
 * @Description TODO
 * @createTime 2022年04月21日 16:53
 */


public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }




}
