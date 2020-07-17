package Interface;

/**
 * @author wang yuteng
 * @data 2020/7/17 15:07
 */
/*
* 在任何版本的java中，接口都能定义抽象方法：
* public abstract 返回值类型 方法名称（参数列表）;
*
* 注意事项
* 1.接口当中的抽象方法，修饰符必须是两个固定的关键字，public abstract
* 2.这两个关键字修饰符，可以选择性的忽略
* */
public interface Interface_my_abstract {

    public abstract void methodAbs();

    public void methodAbs1();

    abstract void methodAbs2();

    void methodAbs3();

//    以上地中都是接口中的抽象方法的表示方法

}
