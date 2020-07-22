package Note;

/**
 * @author wang yuteng
 * @data 2020/7/22 12:39
 */
public class value {
//    格式:
//   修饰符（public，private，defaut，protected）+【static】+【final】数据类型（int，String，double...)+数据名称
//   加上static表示这个成员变量已经和对象没有关系，是属于类的，使用的时候  类名+数据名称
//   没有static的话  使用  先创建一个对象，通过这个对象使用这个变量
    static String country;
//    （defaut) static String country; 如果没有修饰符一律默认为defaut
    private static int idCounter = 0;
    //如果有数据需要被共享给所有对象使用时，那么就可以使用static修饰
//千万不要为了方便访问数据而使用static修饰成员变量，只有成员变量的数据是真正需要被共享的时候
//才使用static修饰，这里不同的student对象共享同一个idCounter（这才是共享的意思）

    protected double price;
    //    同一包中的同一类和不同类  不同包的子类

    public String color;
    //    所有的包和class以及子类都能够使用的变量

    private String brand;
    //    private是只能当前的class能够使用的变量
    //    使用alt+enter就可以选择同时get和set方法

     String T;
     //这里默认是default，可以同一包的同一类和不同类
     //这里的default和几口的default不一样，接口的default是为了  在进行接口扩展的时候不会破坏于接口相关的代码

    public static final int NUM_OF_CL_ASS = 10;
     //final这里是常量，不能更改


    /*-----------------------------------------------------------------------------------*/
    /*===================================================================================*/
//方法在本类和外部的使用
    /*===========public=============*/
    //   对于public static的方法来说来说，在本class中方法直接就是 方法名或者类.方法名 ，，别的class使用该方法是类.方法名
    //   对于public 的方法来说来说，使用改方法直接就是 先new一个类的对象.方法名
    public static void A(){}
    public void A1(){}

    public static void B(){
        A();
        D();
//        A1();静态static方法中不能调用no-static方法，但是可以通过引用一个对象去调用
    }
    public void C(){
        A();//非静态方法可以直接调用静态方法
        A1();
        D();
        D1();
    }

    /*===========private=============*/
    /*这里public和private的区别就是能否在其他类使用*/
//    对于private static的方法来说来说，只能在本class中方法直接使用方法名调用
    private static void D(){}
    private void D1(){}
//    还有一种在接口的中的私有方法用法
  /* 1.普通私有化方法：解决多个默认方法之间的重复代码的问题
* private 返回值类型 方法名称（参数列表）{方法体}
*
* 2.静态私有化方法解决多个静态方法之间的重复代码的问题
*private static 返回值类型 方法名称（参数列表）{方法体}
*
* /*===========abstract=============*/
/*抽象方法一般用在抽象类和接口里面
** 【public】【abstract】 返回值类型 方法名称（参数列表）
*注意实现类必须覆盖重写接口所有的抽象方法，除非实现类是抽象类
* 抽象方法需要子类继承实现（覆盖），所以通过实现类可以实现该方法
*
* */

    /*===========Main方法================*/
    public static void main(String[] args) {
        /*===========public=============*/
        A();
        value value = new value();
        value.A1();
        /*===========private=============*/
        D();
        value.D1();
    }
}
