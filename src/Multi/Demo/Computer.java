package Multi.Demo;

/**
 * @author wang yuteng
 * @data 2020/7/28 17:03
 */
public class Computer {
    public void poweron() {
        System.out.println("笔记本电脑开机");
    }

    public void poweroff() {
        System.out.println("笔记本电脑关机");
    }

    //使用接口作为方法的参数
    public void useDevice(USB usb) {

        usb.close();
        usb.open();

//        但是再keyboard实现类里面有特有的方法type方法，但是多态是无法直接使用子类中特有的方法的，需要向下转型
        if (usb instanceof Mouse) {//一定要先判断
            Mouse mouse = (Mouse) usb;//向下转型
            mouse.click();//mouse中特有的方法
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
    }
}
