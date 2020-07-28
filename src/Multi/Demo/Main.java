package Multi.Demo;

/**
 * @author wang yuteng
 * @data 2020/7/28 17:13
 */
public class Main {
    public static void main(String[] args) {

//    创建一个笔记本电脑
        Computer computer = new Computer();
        computer.poweron();

//        准备一个鼠标供电脑使用
//        Mouse mouse = new Mouse();
//        首先进行向上转型
        USB usbmouse = new Mouse();
        computer.useDevice(usbmouse);


        computer.poweroff();
//       创建一个usb键盘
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);//虽然usedevice中间是usb对象的，但是这里这样用也可以，是自动转型了

    }
}
