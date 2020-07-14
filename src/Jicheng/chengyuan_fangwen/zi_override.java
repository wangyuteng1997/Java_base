package Jicheng.chengyuan_fangwen;

/**
 * @author wang yuteng
 * @data 2020/7/9 18:39
 */
/*
*override 概念：在继承关系中，方法的名称一样，参数列表也一样
*
*重写(override) 方法的名称一样，参数列表也一样 覆盖重写
*重载（overload），方法的名称一样，参数列表不一样
* */
public class zi_override extends fu{
    public int num_zi =200;
    public  int num = 20;
    public  String A = "1";

    public zi_override(){
//        隐含一个super（）调用父类的构造方法“父类无参构造“
//        如果这里要调用父类的有参构造:

        super(10);
//        super();
//        首先只有子类构造才能调用父类构造方法，第二只能调用一个父类构造方法，并且只有第一个有效
        System.out.println("子类构造方法");
    }


    public void methodzi(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);

// 直接打印局部变量
// 打印本类的成员变量 this
// 打印父类的成员变量 super
//
//
    }

    @Override
    /*方法覆写的注意事项
    * 1必须保证父子类的方法之间的方法名称相同，参数列表也相同
    * @override写在方法前面，用来检测是不是有效的正确覆写重写
    * 这个注解就算不写只要满足要求也是正确的  方法覆写重写
    *
    * 2子类方法的返回值必须小于等于父类方法的返回值范前提：java.lang.object是所有类公共的最高父类
    *java.lang.String就是object类
    *
    * 3子类方法的权限必须大于等于弗雷方法的权限修饰符
    *小扩展：public> protected>(default)>private
    *default 是留空，什么都不写
    *
    *
    * */
    public String method(){
    return A;
    }

    @Override
    public void show() {
        super.show();  //把父类的方法拿过来直接重复利用
//        直接 打出show方法就可以自动填充了
//        然后子类可以添加更多的内容
        System.out.println("子类的方法");
    }
}
