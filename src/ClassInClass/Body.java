package ClassInClass;

/**
 * @author wang yuteng
 * @data 2020/8/14 11:40
 */
/*
* 如果一个事物包含一个事物，那么这就是一个类内部包含另一个类 例如身体和心脏的关系
*
* 分类 1.成员内部类 2.局部内部类（包含匿名内部类）
* 格式：
*
* 1......修饰符 class 外部类{
*      修饰符 class 内部类名称
*
* }
*
* 注意内用外，随意访问，外用内需要内部对象
*
* 2.......局部内部类
* 如果一个类定义再一个方法内部的，那么这就是一个局部内部类，并且只有当前所属的方法才能使用它
*定义格式：
*
*
*
* */
public class Body {//外部类

//---------------------------内部类-------------------------------------
    public class Heart {//成员内部类

        public void beat() {//内部方法
            System.out.println("心脏跳动");
        }
    }
//----------------------------------------------------------------------

    //      外部类的成员变量
    private String name;

    //      外部类的方法
    public void methodBody() {
        System.out.println("外部类的方法");
        Heart heart = new Heart();
        heart.beat();
        //调用内部类的方法
    }
    //-----------------------局部内部类（在方法内部）-----------------------
    public void methodOuter(){
        class Inner {//局部内部类
            final int num = 10;//局部内部类中：如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final】的，final可以省略
            public void methodInner(){
                System.out.println(num);
            }
        }
        //因为局部内部类只能够在这个方法被调用,所以在这个方法内部创建局部内部类的对象
        Inner inner = new Inner();
        inner.methodInner();
    }
}
