package Multi;

/**
 * @author wang yuteng
 * @data 2020/7/23 15:29
 */
/*对象的向上转型秒其实就是多态的写法：
*格式： 父类名称 对象名 = new 子类名称（）；              Animal animal = new Cat（）
*含义：右侧创建一个子类的对象，把他当作父类来看待使用         创建了一只猫，当作动物看待，没有问题
*注意事项：向上转型一定是安全的，从小范围转向了大范围，从小范围的猫，向上转换为大范围的动物园
*
* 对象的向下转型，其实是一个【还原】的动作
 *格式： 子类名称 对象名 = （子类名称）父类对象；
 * 含义：将子类对象 ，【还原】成为本来的子类对象
 *
 *Animal animal = new Cat()本来是猫，向上转型成为动物
 *Cat cat = (Cat)animal;本来是猫，已经被当成动物了，还原为本来的猫
 *注意事项：
 * a.必须保证对象本来创建的时候，就是猫，才能向下转型为猫
 * b.如果对象创建的时候本来不是猫，现在非要向下转型成为猫，就会报错
 * */

public abstract class Animal {

     public abstract void eat();
}
