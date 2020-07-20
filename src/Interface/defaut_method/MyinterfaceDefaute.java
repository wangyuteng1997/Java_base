package Interface.defaut_method;

/**
 * @author wang yuteng
 * @data 2020/7/20 18:48
 */
/*从java8开始 接口里允许定义默认方法
* 格式：
* public defaut 返回值类型 方法类型（参数列表）{方法体}
*
* 备注：接口当中的默认方法可以解决接口升级的问题
*如果接口中新增了抽象类的方法，那么继承的所有子类都需要重新覆盖重写，所以有了默认方法
*
* 1.接口的默认方法，可以通过接口实现类对象，直接调用
* 2.接口的默认方法，也可以被接口实现累进行重写
*
* 抽象类有利于代码的复用，接口有利于代码维护
* */
public interface MyinterfaceDefaute {
    public abstract void methodAbs();

    public default void methodDefaut(){
//        这里public是灰色的代表是可以省略的
        System.out.println("这是新增的默认方法体");
    }
}
