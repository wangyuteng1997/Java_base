package ClassInClass.AnonymousClass;

import Interface.const_method.Myinterface;

/**
 * @author wang yuteng
 * @data 2020/8/17 11:14
 */
public class My implements MyInterface{

    @Override
    public void method() {
        System.out.println("这是一个重写函数");
    }
}
