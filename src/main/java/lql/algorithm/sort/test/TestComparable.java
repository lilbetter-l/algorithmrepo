package lql.algorithm.sort.test;

import lql.algorithm.sort.Student;

/**
 * @author lql
 * @version 1.0.0
 * @ClassName TestComparable.java
 * @Description TODO
 * @createTime 2022年04月21日 15:59
 */

//2.定义测试类Test，在测试类Test中定义测试方法Comparable getMax(Comparable c1,Comparable c2)完成测试
public class TestComparable {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(24);
        s1.setUsername("lql");
        Student s2 = new Student();
        s2.setAge(26);
        s2.setUsername("ouc");
        Comparable max = getMax(s1, s2);
        System.out.println(max);

    }


    public static Comparable getMax(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);
//        如果result<0 则c1比c2大
        if (result>0){
            return c1;
        }else {
            return c2;
        }
    }
}
