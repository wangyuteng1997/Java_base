package Interface.const_method;

/**
 * @author wang yuteng
 * @data 2020/7/22 11:54
 */
/*
 * 接口中也可以定义成员变量，但是必须使用public static final三个关键字进行修饰
 * 格式：
 *public static final 数据类型 常量名称 =数据类型
 * 注意：
 * 一旦使用final关键字进行修饰，说明不可改变
 * 1.接口当中的常量，可以省略public static final注意不屑也是这样
 * 2.接口当中的常量必须进行赋值，不能不进行赋值
 * 3.常量在这里应该大写使用shift+alt+entrer加上回车就可以自动全变成大写了,并且多个单词需要下划线拼接写
 * */
public interface Myinterface {
    //这其实就是一个常量，一旦赋值，就不可以更改
    public static final int NUM_OF_CL_ASS = 10;
//   常量在这里应该大写使用shift+alt+entrer加上回车就可以自动全变成大写了,并且多个单词需要下划线拼接写
//    int num = 10;是一样的
}