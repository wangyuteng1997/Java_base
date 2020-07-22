package Interface.Many_Interface;

/**
 * @author wang yuteng
 * @data 2020/7/22 18:18
 */
public interface MyinterfaceB {
    public abstract void methodB();
    public abstract void method();
    public default void methodDefault(){
        System.out.println("默认方法BBB");
    }
}
