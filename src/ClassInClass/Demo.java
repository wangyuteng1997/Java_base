package ClassInClass;

/**
 * @author wang yuteng
 * @data 2020/8/14 11:49
 */
/*
*如何使用成员内部类，有两种方法
*1.间接方法：在外部类的方法当中，使用内部类，然后main只是调用外部类的方法
*2.直接方式.公式
*外部类名称.内部类名称 对象名 = new 外部类名称().new内部类名称();
* */
public class Demo {
    public static void main(String[] args) {
        Body.Heart A = new Body().new Heart();
        A.beat();
  //调用成员内部类的方法
        Body body = new Body();
        body.methodOuter();
//调用用局部内部类的方法

        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
        //可以直接调用内部类中的方法
    }
}
