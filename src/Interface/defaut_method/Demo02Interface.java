package Interface.defaut_method;

/**
 * @author wang yuteng
 * @data 2020/7/20 19:25
 */
/*
*
*
*
* */
public class Demo02Interface {
    public static void main(String[] args) {
        MyinterfaceDefauteA a = new MyinterfaceDefauteA();
        a.methodAbs();//调用的是抽象方法，实际运行的是右侧实现累
//        调用默认方法，如果实现类当中没有，会去找接口的
        a.methodDefaut();//虽然子类没有重写但是会自动调用
    }
}
