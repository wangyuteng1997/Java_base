package Multi;

/**
 * @author wang yuteng
 * @data 2020/7/23 17:08
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃shit");
    }

    public void watchHouse(){
        System.out.println("狗看家");
    }
}
