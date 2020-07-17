package Interface;

/**
 * @author wang yuteng
 * @data 2020/7/17 14:53
 */
/*接口就是多个类的公共规范
* 接口是一种引用的数据类型，最重要的内容就是其中的抽象方法
*
* 如何定义一个接口的名称：
* public interface 接口名称{
*           接口内容
*     }
*
* 如果是java7，包括1.常量 2.抽象方法
* 如果是java8，包括 3.默认方法 4.静态方法
* 如果是java9 还可以额外包含有 5.私有方法
*
* 接口使用步骤
* 1.接口不能直接使用，必须要有一个实现类来实现改接口
* 格式：
* public class 实现名称 implements 接口名称{}
* 2.接口的实现类必须覆盖重写接口中的所有的抽象方法
*
* 注意事项：
* 如果实现类并没有覆盖重写接口中的抽象方法，那么这个实现类自己就必须是抽象类
*  */
public class interface_notation {
    public static void main(String[] args) {
//        不能直接new接口对象使用
//        创建实现类的对象使用
        interface_my_abstractImpl imp = new interface_my_abstractImpl();
        imp.methodAbs();
    }
}
