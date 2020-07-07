package Obj.object;

/**
 * @author wang yuteng
 * @data 2020/6/29 18:28
 */
/**
 * 使用对象类型作为方法的返回值
 */
public class Phonedemo2 {
    public static void main(String[] args) {
        Phone two = getPhone();
//        这里是使用Phone类的two来接受phone
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.getBrand());

    }

    public static Phone getPhone(){
        Phone phone =new Phone();
        phone.setBrand("Apple");
        phone.color="blue";
        phone.price=21212.2;
        return phone;
    }
}
