package Obj.object;

/**
 * @author wang yuteng
 * @data 2020/6/29 11:30
 */
public class Phone {
    private String brand;
//    private是只能当前的class能够使用的变量
//    使用alt+enter就可以选择同时get和set方法
    protected double price;

//    只能当前package下的class能够使用的变量
    public String color;
//    所有的包和class都能够使用的变量

    static  String country;
//如果有数据需要被共享给所有对象使用时，那么就可以使用static修饰
//千万不要为了方便访问数据而使用static修饰成员变量，只有成员变量的数据是真正需要被共享的时候
//才使用static修饰

    public static void main(String[] args) {
       Phone p1 = new Phone("Aplle",2333,"blue");
    }

//    这里是创建一个构造器，构造器没有返回的类型并且名称和类的名称一致，主要是对类中的参数进行赋值
    public Phone (){
    }
    public Phone (String brand,double price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }

    public void call(String who){
        System.out.println("给"+ who +"打电话");
    }

    public void sendMessage(String who){
        System.out.println("给"+ who +"发短信");
    }

    //private类型的变量需要调用get和set方法进行赋值
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}

