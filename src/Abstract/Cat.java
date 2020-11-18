package Abstract;

/**
 * wangyuteng create
 * 14/07/2020 20:13
 */
public class Cat extends Aninal{


 //   方法的重写快捷键使ctrl+o选择
    @Override
    public void normalMethod() {
       super.normalMethod();
        System.out.println("2");
    }


    @Override
    public void eat(){
        System.out.println("猫吃鱼");


    }
}
