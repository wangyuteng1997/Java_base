package Obj.object;

/**
 * @author wang yuteng
 * @data 2020/6/29 18:14
 */
public class static_Or_nostatic {

    public static void main(String[] args) {
     hello();

     static_Or_nostatic t = new static_Or_nostatic();
     t.hello1();
    }
    public static void hello(){
        System.out.println("hello");
    }
    public  void hello1(){
        System.out.println("hello1");
    }




}
