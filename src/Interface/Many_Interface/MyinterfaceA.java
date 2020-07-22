package Interface.Many_Interface;

/**
 * @author wang yuteng
 * @data 2020/7/22 18:18
 */
public interface MyinterfaceA {
    public abstract void method();
    public abstract void methodA();
    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }
}
