package fanxing;
/*
* 定义一个含有泛型的类，墨迹Arrarylist集合
* 泛型是一个位置的数据类型，当我们你不确定是什么数据类型的时候，可以使用泛型
* 泛型可以接受任意的数据类型，可以使用Integer，String，Student
* 创建对象的时候确定泛型的类型
*
* */
public class Demo02Generic_class<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
