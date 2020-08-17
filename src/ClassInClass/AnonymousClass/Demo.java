package ClassInClass.AnonymousClass;

/**
 * @author wang yuteng
 * @data 2020/8/17 11:16
 */
/*
* 如果接口的实现类（或者是父类的子类）只需要使用唯一的一次
* 那么这种情况下就可以省略该类的父类，改为使用【匿名内部类】
*
* 匿名内部类的定义格式
* 接口名称 对象名 = new 接口名称（）{
*       覆盖重写的方法
* }
*
*注意的问题：
* 1.匿名内部类 在创建对象的时候只能使用唯一一次
*
* */
public class Demo {
    public static void main(String[] args) {


    MyInterface myInterface = new MyInterface() {
        @Override
        public void method() {
            System.out.println("匿名内部类实现了方法");
        }
    };
        myInterface.method();
    }
}
