package Interface.Many_Interface;

/**
 * @author wang yuteng
 * @data 2020/7/22 18:19
 */
/*
* 1.如果实现类继承了多个几口，并且抽象方法重复，那么只需要重写一次
* 2.如果实现类没有覆盖重写所有接口中的所有抽象方法，那么实现类必须是一个抽象类
* 3.如果西线类实现的多个接口中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖
* 4.如果一个类直接父类中的方法和接口中的方法产生了冲突，那么优先使用父类中的方法
* */
public class MyinterfaceImp /*extends Object*/implements MyinterfaceA,MyinterfaceB{
    @Override
    public void method() {
        System.out.println("AB接口重复的抽象方法只需要重写一次");
    }

    //    java中都是隐含继承了Object
    @Override
    public void methodA() {
        System.out.println("重写了A方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("wdqwd");
    }

    @Override
    public void methodB() {
        System.out.println("重写了B方法");

    }
}
