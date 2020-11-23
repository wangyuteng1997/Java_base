package fanxing;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        show01();
    }
    /**
     *创建集合对象，使用泛型
     * 好处：1.避免两类型转换的麻烦，存储的是什么类型，取出的就是什么类型
     *      2.并且把运行期异常（代码运行之后的抛出的异常）提升到了编译器（写代码的时候就会报错）
     * 弊端：泛型是神呢类型就会存储什么类型的数据
     * */
    private static void show02() {
        ArrayList<String> list = new ArrayList();
        list.add("abc");
        //list.add(1); 直接编译的时候这里就会报错

//  使用迭代器遍历list集合
//  获取迭代器
        Iterator<String> it = list.iterator();
//  使用迭代器中的方法hasNext和next遍历集合
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
    }
    /**
     *创建集合对象，不使用泛型
     * 好处：集合不适用泛型，默认的类型就是object的类型，可以存储任意类型的数据
     * 弊端：不安全会引发异常
     * */
    private static void show01(){
        ArrayList list =new ArrayList();
        list.add("abc");
        list.add(1);

//  使用迭代器遍历list集合
//  获取迭代器
        Iterator it = list.iterator();
//  使用迭代器中的方法hasNext和next遍历集合
        while (it.hasNext()){
            //取出元素也是object类型
            Object obj = it.next();
            System.out.println(obj);

            //想要使用String类特有的方法，length获取字符串的长度
            //需要向下转型
            //会抛出异常ClassCastException转换异常，不能把Integer类型转位String类型，不安全，容易引发异常
            String s = (String) obj;
            System.out.println(s.length());
        }

    }
}
