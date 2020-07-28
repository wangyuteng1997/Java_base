package Multi;

/**
 * @author wang yuteng
 * @data 2020/7/23 16:29
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

//子类特有的方法
    public void CatchMouse(){
        System.out.println("猫抓老鼠");
    }
}
