package lql.algorithm.sort;

/**
 * @author lql
 * @version 1.0.0
 * @ClassName Student.java
 * @Description TODO
 * @createTime 2022年04月21日 15:54
 */

//定义一个学生类Student，具有年龄age和姓名username两个属性，并通过Comparable接口提供比较规则；
public class Student implements Comparable<Student>{
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }
}
