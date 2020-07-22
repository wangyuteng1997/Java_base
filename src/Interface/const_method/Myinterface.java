package Interface.const_method;

/**
 * @author wang yuteng
 * @data 2020/7/22 11:54
 */
/*
 * 接口中也可以定义成员变量，但是必须使用public static final三个关键字进行修饰
 * 格式：
 *public static final 数据类型 常量名称 =数据类型
 * */
public interface Myinterface {
    //这其实就是一个常量，一旦赋值，就不可以更改
    public static final int num = 10;
}
