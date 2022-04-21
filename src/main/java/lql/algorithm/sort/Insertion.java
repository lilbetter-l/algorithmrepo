package lql.algorithm.sort;

/**
 * @author lql
 * @version 1.0.0
 * @ClassName Insertion.java
 * @Description TODO
 * @createTime 2022年04月21日 20:32
 */
//测试上传一个GitHub

public class Insertion {
    //    对数组a中的元素进行排序
    public static void sort(Comparable[] a){
//        从1开始是因为第一个默认是有序的，也就是0位置是有序的
        for (int i=1;i<a.length;i++){
            for (int j=i;j>0;j--){
//                比较索引j处的数值和索引j-1处的数值，如果索引j-1处的数值比索引j处的值大
//                则交换数据，如果不大，那么就找到合适的位置啦，可以退出循环啦
                if (greater(a[j-1],a[j])){
                    exch(a,j-1,j);
                }else {
                    break;
                }
            }
        }

    }
    //    比较v元素是否大于w元素
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w) >0;
    }
    //    数组元素i和j交换位置
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }




}
