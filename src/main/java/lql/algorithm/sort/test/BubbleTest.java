package lql.algorithm.sort.test;

import lql.algorithm.sort.Bubble;

import java.util.Arrays;

/**
 * @author lql
 * @version 1.0.0
 * @ClassName BubbleTest.java
 * @Description TODO
 * @createTime 2022年04月21日 16:28
 */


public class BubbleTest {
    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        Bubble.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
