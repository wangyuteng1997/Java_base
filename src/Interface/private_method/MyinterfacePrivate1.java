package Interface.private_method;

/**
 * wangyuteng create
 * 20/07/2020 21:57
 */
/*问题描述：
* 我们需要一个共有方法用来解决多个默认方法的重复代码的问题
* 但是这个公有方法不应该被实现类使用，应该是私有化的
* 解决方法：
* 1.普通私有化方法：解决多个默认方法之间的重复代码的问题
* private 返回值类型 方法名称（参数列表）{方法体}
*
* 2.静态私有化方法解决多个静态方法之间的重复代码的问题
*private static 返回值类型 方法名称（参数列表）{方法体}
*  */
public interface MyinterfacePrivate1 {
    public default void methodDefautA(){
        System.out.println("默认方法A");
        methodcommun();
    }

    public default void methodDefautB(){
        System.out.println("默认方法B");
        methodcommun();
    }
/*
    public default void methodcommun(){
        System.out.println("AAA");
        System.out.println("AAA");
        System.out.println("AAA");
    }*/
//因为defaut是后面的  实现类 都能继承该方法（直接用）methodcommun   对象.methodcommun在psvm中实现
    static void methodcommun(){
        System.out.println("AAA");
        System.out.println("AAA");
        System.out.println("AAA");
    }
}
