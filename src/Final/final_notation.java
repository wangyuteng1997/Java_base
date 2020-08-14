package Final;

/**
 * @author wang yuteng
 * @data 2020/8/7 15:57
 */
/*
* final关键字代表是最终的，不可以改变的
* 常见四种用法：
* 1.可以修饰一个类
* 2.可以用来修饰一个方法
* 2.可以用来修饰一个局部变量
* 3.可以用来修饰一个成员变量
* */
    /*
    * 当final用来修饰一个类的时候：
    * 含义：当前这个类不能有任何的子类
    * 注意：一个类如果是final类型的，那么其中所有的成员方法都无法进行覆盖重写（只有子类能够覆盖重写父类的方法）
    * */

    /*当final用来修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写
    *注意事项：对于类和方法来说abstract关键字和final关键字不能同时使用，会矛盾
    * public  abstract final void a(){}abstract抽象方法需要被覆盖重写，但是final又不能被覆盖重写，所以是矛盾的  
    *
    * */
public final class final_notation {
}
