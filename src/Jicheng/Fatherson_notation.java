package Jicheng;

/**
 * @author wang yuteng
 * @data 2020/7/9 17:56
 */
//面向对象的3大特性 封装性 继承性 多态性
//继承是多态的前提，没有继承就没有多态
//员工类（姓名，工号）父类
//子类中的姓名和工号继承了父类 这样就不需要重复的创建相同的信息
//    讲师类（**姓名 **工号   讲师的方法（））  子类
//    助教类（**姓名 **工号   助教的方法（））  子类
//    继承的特点：
//    1.子类可以拥有父类的内容  2.子类可以拥有父类没有的

/**
 * 父类的格式局就是一个普通的类
 * 子类的格式 会extends 父类
 * 当在别的类中new 一个新的子类对象  可以直接继承父类的方法
 * 一个父类，两个甚至多个子类都能使用子类达到了代码复用的效果
 * */
public class Fatherson_notation {

    public static void main(String[] args) {
        teacher teacher = new teacher();
        Assistant assistant = new Assistant();
        teacher.hello();
        assistant.hello();

    }
}
