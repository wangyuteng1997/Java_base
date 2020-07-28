package Multi;

/**
 * @author wang yuteng
 * @data 2020/7/28 15:46
 */
/*如何才能知道一个父类引用得对象，本来是什么子类
* 格式：   对象 instanceof 类名称
* 这会得到一个布尔值类型，也就是判断前面得对象能不能当作后面的类型的实例
* */
public class InstanceOf {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

//
//        如果希望调用子类的特有方法，需要向下转型
//        判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog ){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if (animal instanceof Cat ){
            Cat cat = (Cat) animal;
            cat.CatchMouse();
        }


    }




}
