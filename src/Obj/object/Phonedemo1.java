package Obj.object;

/**
 * @author wang yuteng
 * @data 2020/6/29 16:24
 */

/**
 * 使用对象类型作为方法的参数
 */
public class Phonedemo1 {
    public static void main(String[] args) {
//      调用一个类需要在方法中才能够调用，在类中调用令外一个类会出错
        Phone phone = new Phone();
//      这里的new Phone其实是new 了Phone里面的一个空参的构造器，但是平时不需要写是因为默认有了
//      但是在Phone类中我们又重新写了一个新的带参数的构造器，那么我们就要构建一个新的不带参数的构造器，否则就会报错

        Phone phone1 = new Phone("apple",213123.3,"Blue");
//       这里的new Phone其实是new 了Phone里面的带参的构造器
        /*
    public Phone (){
    }
    public Phone (String brand,double price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }*/
        phone.price = 8888.0;
        phone.color = "black";
        phone.setBrand("Apple");
//        System.out.println(phone.color);
//        System.out.println(phone.getBrand());
//        System.out.println(phone.price);
        method6(phone);
    }


public static void method6(Phone phone) {
    System.out.println(phone.price);
    System.out.println(phone.color);
    System.out.println(phone.getBrand());
}
}

//传参的各种形式
/*
    public static void method1(int a){

    }
    public static void method3(String a){

    }
    public static void method4( String a,Double b){

    }
    public static void method5(int [] arrey){

    }
    public static void method6(Phone phone){
    }

*/
