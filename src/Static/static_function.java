package Static;


/**
 * @author wang yuteng
 * @data 2020/7/7 16:52
 */

//方法在不同的类中的调用 以及static方法在其他类中的调用
//    区别在于是否需要new一个新的方法的对象

public class static_function {
    public static void main(String[] args) {

         Need.H();
//       Need.H2();
//       这里因为static被private修饰只能在它的类中使用


           Need T = new Need();
           T.H1();
//         T.H3();
//        因为private修饰的方法只能在它的class中使用

        P();
//        对于本类中的static方法，可以直接调用而不需要class.方法

    }

    public static void P(){
        System.out.println("11111");
    }
}
